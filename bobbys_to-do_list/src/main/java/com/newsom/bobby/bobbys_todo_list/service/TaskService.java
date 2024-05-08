package com.newsom.bobby.bobbys_todo_list.service;

import com.newsom.bobby.bobbys_todo_list.model.Task;
import com.newsom.bobby.bobbys_todo_list.model.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


    @Service
    public class TaskService {

        @Autowired
        private TaskRepository taskRepository;

        public Task addTask(Task task) {
            return taskRepository.save(task);  // Save the task to the database
        }

        public List<Task> getAllTasks() {
            return (List<Task>) taskRepository.findAll();  // Retrieve all tasks
        }

        public Task getTaskById(Long id) {
            return taskRepository.findById(id).orElse(null);  // Find by ID or return null if not found
        }

        public void updateTask(Task task) {
            taskRepository.save(task);  // Update the existing task
        }

        public void deleteTask(Long id) {
            taskRepository.deleteById(id);  // Delete by ID
        }
    }


