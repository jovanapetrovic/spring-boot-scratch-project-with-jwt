package com.jovana.scratchapp.service;

import com.jovana.scratchapp.dto.JwtResponse;
import com.jovana.scratchapp.dto.LoginRequest;
import com.jovana.scratchapp.dto.RegisterRequest;
import org.springframework.http.ResponseEntity;

/**
 * Created by jovana on 30.07.2021
 */
public interface AuthService {

    JwtResponse authenticateUser(LoginRequest loginRequest);

    ResponseEntity registerUser(RegisterRequest registerRequest);

}
