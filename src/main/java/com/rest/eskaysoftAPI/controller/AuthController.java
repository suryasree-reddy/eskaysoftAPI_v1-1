package com.rest.eskaysoftAPI.controller;

import java.net.URI;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.rest.eskaysoftAPI.entity.Role;
import com.rest.eskaysoftAPI.entity.User;
import com.rest.eskaysoftAPI.exception.AppException;
import com.rest.eskaysoftAPI.model.ApiResponse;
import com.rest.eskaysoftAPI.model.JwtAuthenticationResponse;
import com.rest.eskaysoftAPI.model.LoginRequest;
import com.rest.eskaysoftAPI.model.UserInformation;
import com.rest.eskaysoftAPI.repository.RoleRepository;
import com.rest.eskaysoftAPI.repository.UserRepository;
import com.rest.eskaysoftAPI.security.JwtTokenProvider;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

	@Autowired
	AuthenticationManager authenticationManager;

	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	JwtTokenProvider tokenProvider;

	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsernameOrEmail(), loginRequest.getPassword()));

		String jwt = tokenProvider.generateToken(authentication);
		return ResponseEntity.ok(new JwtAuthenticationResponse(jwt));
	}

	 @PostMapping("/createUser")
		public ResponseEntity<?> registerUser(@RequestBody UserInformation userproRequest) {
			if (userRepository.existsByUsername(userproRequest.getUsername())) {
				return new ResponseEntity(new ApiResponse(false, "Username is already taken!"), HttpStatus.BAD_REQUEST);
			}

			if (userRepository.existsByEmail(userproRequest.getEmail())) {
				return new ResponseEntity(new ApiResponse(false, "Email Address already in use!"), HttpStatus.BAD_REQUEST);
			}
			
			User user = new User();
	        BeanUtils.copyProperties(userproRequest, user);

			user.setPassword(passwordEncoder.encode(user.getPassword()));

			List<Role> userRoles = roleRepository.findByNameIn(userproRequest.getRoles())
					.orElseThrow(() -> new AppException("User Role not set."));
			Set<Role> roleNames = userRoles.stream().collect(Collectors.toSet());
			user.setRoles(roleNames);

			User result = userRepository.save(user);

			URI location = ServletUriComponentsBuilder.fromCurrentContextPath().path("/users/{username}")
					.buildAndExpand(result.getUsername()).toUri();

			return ResponseEntity.created(location).body(new ApiResponse(true, "User registered successfully"));
		}
		

}
