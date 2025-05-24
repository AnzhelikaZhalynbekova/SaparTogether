package com.example.sapar.controllers;

import com.example.sapar.Dtos.RegisterRequest;
import com.example.sapar.entities.User;
import com.example.sapar.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody RegisterRequest registerRequest) {
        if(userRepository.existsByUsername(registerRequest.getUsername()) || userRepository.existsByEmail(registerRequest.getEmail())) {
            return ResponseEntity.badRequest().body("Username or email already exists");
        }
        User user = new User();
        user.setUsername(registerRequest.getUsername());
        user.setEmail(registerRequest.getEmail());
        user.setPassword(passwordEncoder.encode(registerRequest.getPassword()));
        userRepository.save(user);
        return ResponseEntity.ok("Successfully registered");
    }
}
