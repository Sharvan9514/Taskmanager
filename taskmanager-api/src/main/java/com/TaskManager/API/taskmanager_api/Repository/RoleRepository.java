package com.TaskManager.API.taskmanager_api.Repository;

import com.TaskManager.API.taskmanager_api.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}