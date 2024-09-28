package com.TaskManager.API.taskmanager_api.Controller;
import com.TaskManager.API.taskmanager_api.dto.TaskRequest;
import com.TaskManager.API.taskmanager_api.Services.TaskService;
import com.TaskManager.API.taskmanager_api.util.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public ResponseEntity<ApiResponse> createTask(@RequestBody TaskRequest taskRequest) {
        return ResponseEntity.ok(taskService.createTask(taskRequest));
    }

    @GetMapping
    public ResponseEntity<ApiResponse> getTasks() {
        return ResponseEntity.ok(taskService.getTasks());
    }

    @PutMapping("/{taskId}")
    public ResponseEntity<ApiResponse> updateTask(@PathVariable Long taskId, @RequestBody TaskRequest taskRequest) {
        return ResponseEntity.ok(taskService.updateTask(taskId, taskRequest));
    }

    @DeleteMapping("/{taskId}")
    public ResponseEntity<ApiResponse> deleteTask(@PathVariable Long taskId) {
        return ResponseEntity.ok(taskService.deleteTask(taskId));
    }
}
