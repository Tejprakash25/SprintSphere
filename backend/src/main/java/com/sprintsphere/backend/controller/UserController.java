package com.sprintsphere.backend.controller;

import com.sprintsphere.backend.dto.CreateUserRequest;
import com.sprintsphere.backend.dto.UserResponse;
import com.sprintsphere.backend.entity.User;
import com.sprintsphere.backend.service.UserService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import com.sprintsphere.backend.exception.ResourceNotFoundException;

import org.springframework.security.access.prepost.PreAuthorize;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserResponse createUser(@Valid @RequestBody CreateUserRequest request) {
        System.out.println(">>> REGISTER ENDPOINT HIT <<<");
        return userService.createUser(request);
    }

    @GetMapping
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public List<UserResponse> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{email}")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public UserResponse getUserByEmail(@PathVariable String email) {
        return userService.getUserByEmail(email);
    }
}