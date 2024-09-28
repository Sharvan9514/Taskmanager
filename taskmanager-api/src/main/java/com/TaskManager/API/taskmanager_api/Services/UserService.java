package com.TaskManager.API.taskmanager_api.Services;

import com.TaskManager.API.taskmanager_api.Model.User;
import com.TaskManager.API.taskmanager_api.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User findByUsername(String username) {
        return userRepository.findByUsername(username).orElse(null);
    }

    // Additional methods for user management can be added here
}
