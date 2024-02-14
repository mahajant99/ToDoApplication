package com.mahajant99.todoapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mahajant99.todoapplication.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer>{
    
}
