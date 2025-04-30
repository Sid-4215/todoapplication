package com.taskmanager.Task.Services;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.taskmanager.Task.Model.Task;

public interface TaskRepository extends MongoRepository<Task, String> {
}

