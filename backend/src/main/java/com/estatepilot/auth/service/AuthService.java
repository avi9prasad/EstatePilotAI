package com.estatepilot.auth.service;

import com.estatepilot.auth.dto.AuthResponse;
import com.estatepilot.auth.dto.LoginRequest;
import com.estatepilot.auth.dto.RegisterRequest;

public interface AuthService {

    AuthResponse register(RegisterRequest request);

    AuthResponse login(LoginRequest request);

}