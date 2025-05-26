package com.example.sapar.controllers;

import com.example.sapar.Dtos.UserProfileDto;
import com.example.sapar.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PutMapping("/profile")
    public ResponseEntity<?> updateProfile(@RequestBody UserProfileDto dto, Principal principal) {
        String username = principal.getName();
        return ResponseEntity.ok(userService.updateProfile(username, dto));
    }
}
