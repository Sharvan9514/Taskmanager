package com.TaskManager.API.taskmanager_api.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class TaskRequest {
    private String title;
    private String description;
    private String status;
    private String priority;
    private LocalDate dueDate;
}
