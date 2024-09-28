package com.TaskManager.API.taskmanager_api.Model;

import jakarta.persistence.*;
import lombok.Data;


import java.util.Set;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Set<Task> tasks;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles;
}