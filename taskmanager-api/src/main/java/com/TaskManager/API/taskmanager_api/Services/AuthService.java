package com.TaskManager.API.taskmanager_api.Services;

import com.TaskManager.API.taskmanager_api.dto.LoginRequest;
import com.TaskManager.API.taskmanager_api.dto.RegisterRequest;
import com.TaskManager.API.taskmanager_api.util.ApiResponse;

public interface AuthService {
    ApiResponse register(RegisterRequest request);
    ApiResponse login(LoginRequest request);
}







