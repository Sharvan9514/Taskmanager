package com.TaskManager.API.taskmanager_api;

import org.springframework.boot.SpringApplication;

public class TestTaskmanagerApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(TaskmanagerApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
