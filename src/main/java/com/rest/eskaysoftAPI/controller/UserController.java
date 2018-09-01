package com.rest.eskaysoftAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.rest.eskaysoftAPI.entity.User;
import com.rest.eskaysoftAPI.exception.ResourceNotFoundException;
import com.rest.eskaysoftAPI.model.UserIdentityAvailability;
import com.rest.eskaysoftAPI.model.UserSummary;
import com.rest.eskaysoftAPI.repository.UserRepository;
import com.rest.eskaysoftAPI.security.CurrentUser;
import com.rest.eskaysoftAPI.security.UserPrincipal;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/user")
    @PreAuthorize("hasRole('USER')")
    public UserSummary getCurrentUser(@CurrentUser UserPrincipal currentUser) {
        UserSummary userSummary = new UserSummary(currentUser.getId(), currentUser.getUsername(), currentUser.getName());
        return userSummary;
    }

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
    public UserSummary getUserProfile(@PathVariable(value = "username") String username) {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new ResourceNotFoundException("User", "username", username));
        
        UserSummary userSummary = new UserSummary(user.getId(), user.getUsername(), user.getName());
        return userSummary;
    }
}
