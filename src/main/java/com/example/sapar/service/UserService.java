package com.example.sapar.service;

import com.example.sapar.Dtos.UserProfileDto;
import com.example.sapar.entities.User;
import com.example.sapar.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User updateProfile(String username, UserProfileDto dto) {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
        user.setAge(dto.getAge());
        user.setGender(dto.getGender());
        user.setPhoto(dto.getPhoto());
        return userRepository.save(user);
    }
}
