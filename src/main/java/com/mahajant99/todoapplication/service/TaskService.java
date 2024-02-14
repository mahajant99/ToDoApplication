package com.mahajant99.todoapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mahajant99.todoapplication.model.Task;
import com.mahajant99.todoapplication.repository.TaskRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TaskService {
    
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
        
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public void deleteTask(Integer id){
        taskRepository.deleteById(id);
    }
}