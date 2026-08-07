package com.estatepilot.auth.service;

import com.estatepilot.auth.dto.AuthResponse;
import com.estatepilot.auth.dto.LoginRequest;
import com.estatepilot.auth.dto.RegisterRequest;
import com.estatepilot.auth.entity.Role;
import com.estatepilot.auth.entity.User;
import com.estatepilot.auth.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    @Override
    public AuthResponse register(RegisterRequest request) {

        if (userRepository.existsByEmail(request.getEmail())) {
            return new AuthResponse(null, "Email already exists");
        }

        User user = new User();

        user.setEmail(request.getEmail());

        user.setPassword(passwordEncoder.encode(request.getPassword()));

        user.setRole(Role.valueOf(request.getRole().toUpperCase()));

        userRepository.save(user);

        return new AuthResponse(
                null,
                "User Registered Successfully"
        );
    }

    @Override
    public AuthResponse login(LoginRequest request) {

        return new AuthResponse(
                null,
                "Login API coming next"
        );
    }
}