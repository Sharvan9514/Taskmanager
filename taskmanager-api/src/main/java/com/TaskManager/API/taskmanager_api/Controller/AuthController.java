package com.TaskManager.API.taskmanager_api.Controller;

import com.TaskManager.API.taskmanager_api.Services.AuthService;
import com.TaskManager.API.taskmanager_api.dto.LoginRequest;
import com.TaskManager.API.taskmanager_api.dto.RegisterRequest;
import com.TaskManager.API.taskmanager_api.util.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<ApiResponse> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<ApiResponse> login(@RequestBody LoginRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }
}
