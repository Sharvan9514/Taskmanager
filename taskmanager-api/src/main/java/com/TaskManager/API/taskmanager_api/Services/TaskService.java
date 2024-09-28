package com.TaskManager.API.taskmanager_api.Services;
import com.TaskManager.API.taskmanager_api.dto.TaskRequest;
import com.TaskManager.API.taskmanager_api.util.ApiResponse;

public interface TaskService {
    ApiResponse createTask(TaskRequest taskRequest);
    ApiResponse getTasks();
    ApiResponse updateTask(Long taskId, TaskRequest taskRequest);
    ApiResponse deleteTask(Long taskId);
}