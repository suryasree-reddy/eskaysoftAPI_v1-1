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

import com.rest.eskaysoftAPI.entity.Districts;
import com.rest.eskaysoftAPI.entity.Role;
import com.rest.eskaysoftAPI.entity.User;
import com.rest.eskaysoftAPI.exception.AppException;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.exception.ResourceNotFoundException;
import com.rest.eskaysoftAPI.model.ApiResponse;
import com.rest.eskaysoftAPI.model.JwtAuthenticationResponse;
import com.rest.eskaysoftAPI.model.LoginRequest;
import com.rest.eskaysoftAPI.model.UserInformation;
import com.rest.eskaysoftAPI.repository.DistrictsRepository;
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

	@Autowired
	private DistrictsRepository disrepo;

	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsernameOrEmail(), loginRequest.getPassword()));

		String jwt = tokenProvider.generateToken(authentication);
		return ResponseEntity.ok(new JwtAuthenticationResponse(jwt));
	}

	
	@PostMapping("/changePassword")
	public ResponseEntity<?> changePassword(@Valid @RequestBody LoginRequest loginRequest) {

		User user = userRepository.findByUsername(loginRequest.getUsernameOrEmail()).orElseThrow(
				() -> new ResourceNotFoundException("User", "username", loginRequest.getUsernameOrEmail()));

		user.setPassword(passwordEncoder.encode(loginRequest.getPassword()));
		user.setCreatedNew(false);
		userRepository.save(user);

		return ResponseEntity.ok().body(new ApiResponse(true, "Password changed successfully"));
	}

}
