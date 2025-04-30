package com.taskmanager.Task.Services;
import java.util.List;

import com.taskmanager.Task.Model.Task;

public interface TaskService {
    List<Task> getAllTasks();
    Task createTask(Task task);
    Task updateTask(String id, Task task);
    void deleteTask(String id);
}

