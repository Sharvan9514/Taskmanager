package com.TaskManager.API.taskmanager_api.Repository;
import com.TaskManager.API.taskmanager_api.Model.Task;
import com.TaskManager.API.taskmanager_api.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByUser(User user);
}