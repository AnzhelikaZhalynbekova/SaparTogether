package com.example.sapar;

import com.example.sapar.entities.User;
import com.example.sapar.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class InitUser implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(String... args) throws Exception {
        User user = User.builder()
                .username("User")
                .email("User@example.com")
                .password(passwordEncoder.encode("123456"))
                .enabled(true)
                .role("USER")
                .age(24)
                .gender("Male")
                .photo("https://example.com/photo.jpg")
                .build();

        User admin = User.builder()
                .username("Test")
                .email("Admin@example.com")
                .password(passwordEncoder.encode("123456"))
                .enabled(true)
                .role("USER")
                .age(24)
                .gender("Male")
                .photo("https://example.com/photo.jpg")
                .build();

        userRepository.save(user);
        userRepository.save(admin);
    }


}
