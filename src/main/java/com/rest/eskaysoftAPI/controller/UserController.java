package com.rest.eskaysoftAPI.controller;

import java.net.URI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.rest.eskaysoftAPI.entity.Districts;
import com.rest.eskaysoftAPI.entity.Role;
import com.rest.eskaysoftAPI.entity.RoleName;
import com.rest.eskaysoftAPI.entity.User;
import com.rest.eskaysoftAPI.exception.AppException;
import com.rest.eskaysoftAPI.exception.NotFoundException;
import com.rest.eskaysoftAPI.exception.ResourceNotFoundException;
import com.rest.eskaysoftAPI.model.ApiResponse;
import com.rest.eskaysoftAPI.model.UserIdentityAvailability;
import com.rest.eskaysoftAPI.model.UserInformation;
import com.rest.eskaysoftAPI.repository.DistrictsRepository;
import com.rest.eskaysoftAPI.repository.RoleRepository;
import com.rest.eskaysoftAPI.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	RoleRepository roleRepository;

	@Autowired
	private DistrictsRepository disrepo;

	@GetMapping("/user/checkUsernameAvailability")
	public UserIdentityAvailability checkUsernameAvailability(@RequestParam(value = "username") String username) {
		Boolean isAvailable = !userRepository.existsByUsername(username);
		return new UserIdentityAvailability(isAvailable);
	}

	@GetMapping("/user/checkEmailAvailability")
	public UserIdentityAvailability checkEmailAvailability(@RequestParam(value = "email") String email) {
		Boolean isAvailable = !userRepository.existsByEmail(email);
		return new UserIdentityAvailability(isAvailable);
	}

	@GetMapping("/users/{username}")
	public UserInformation getUserProfile(@PathVariable(value = "username") String username) {
		User user = userRepository.findByUsername(username)
				.orElseThrow(() -> new ResourceNotFoundException("User", "username", username));

		UserInformation info = new UserInformation();
		BeanUtils.copyProperties(user, info);
		info.setDistrictId(user.getDistrictId().getId());
		info.setDistrictName(user.getDistrictId().getDistrictName());
		info.setState(user.getDistrictId().getStateId().getStateName());
		info.setStateCode(user.getDistrictId().getStateId().getStateCode());
		Set<RoleName> roles = new HashSet<>();
		for (Role role : user.getRoles()) {
			roles.add(role.getName());
		}

		info.setRoles(roles);

		return info;
	}

	@GetMapping("/users")
	public List<UserInformation> getAllUserProfile() {
		List<UserInformation> users = new ArrayList<>();
		userRepository.findAll().forEach(user -> {
			UserInformation info = new UserInformation();
			BeanUtils.copyProperties(user, info);
			info.setDistrictId(user.getDistrictId().getId());
			info.setDistrictName(user.getDistrictId().getDistrictName());
			info.setState(user.getDistrictId().getStateId().getStateName());
			info.setStateCode(user.getDistrictId().getStateId().getStateCode());
			Set<RoleName> roles = new HashSet<>();
			for (Role role : user.getRoles()) {
				roles.add(role.getName());
			}

			info.setRoles(roles);
			users.add(info);
		});
		return users;
	}

	@PutMapping("/updateUser")
	public ResponseEntity<?> updateUser(@Valid @RequestBody UserInformation userproRequest) {

		Districts dis = disrepo.findById(userproRequest.getDistrictId()).orElseThrow(
				() -> new NotFoundException(String.format("Districts %d not found", userproRequest.getDistrictId())));

		List<Role> userRoles = roleRepository.findByNameIn(userproRequest.getRoles())
				.orElseThrow(() -> new AppException("User Role not set."));
		Set<Role> roleNames = userRoles.stream().collect(Collectors.toSet());
		User user = new User();
		BeanUtils.copyProperties(userproRequest, user);

		user.setRoles(roleNames);
		user.setDistrictId(dis);

		user = userRepository.save(user);

		return ResponseEntity.ok().body(new ApiResponse(true, "User Updated successfully"));
	}

	@DeleteMapping("/users/{username}")
	public ResponseEntity<?> deleteUser(@PathVariable(value = "username") String username) {
		User user = userRepository.findByUsername(username)
				.orElseThrow(() -> new ResourceNotFoundException("User", "username", username));
		userRepository.delete(user);

		return ResponseEntity.ok().body(new ApiResponse(true, "User Deleted successfully"));
	}
	
	@PostMapping("/createUser")
	public ResponseEntity<?> registerUser(@RequestBody UserInformation userproRequest) {
		if (userRepository.existsByUsername(userproRequest.getUsername())) {
			return new ResponseEntity(new ApiResponse(false, "Username is already taken!"), HttpStatus.BAD_REQUEST);
		}

		if (userRepository.existsByEmail(userproRequest.getEmail())) {
			return new ResponseEntity(new ApiResponse(false, "Email Address already in use!"), HttpStatus.BAD_REQUEST);
		}

		Districts dis = disrepo.findById(userproRequest.getDistrictId()).orElseThrow(
				() -> new NotFoundException(String.format("Districts %d not found", userproRequest.getDistrictId())));

		User user = new User();
		BeanUtils.copyProperties(userproRequest, user);

		user.setPassword(passwordEncoder.encode(user.getPassword()));

		List<Role> userRoles = roleRepository.findByNameIn(userproRequest.getRoles())
				.orElseThrow(() -> new AppException("User Role not set."));
		Set<Role> roleNames = userRoles.stream().collect(Collectors.toSet());
		user.setRoles(roleNames);
		user.setDistrictId(dis);
		User result = userRepository.save(user);

		URI location = ServletUriComponentsBuilder.fromCurrentContextPath().path("/users/{username}")
				.buildAndExpand(result.getUsername()).toUri();

		return ResponseEntity.created(location).body(new ApiResponse(true, "User registered successfully"));
	}
}
