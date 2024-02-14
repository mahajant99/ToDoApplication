package com.mahajant99.todoapplication.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "priority")
    private TaskPriority priority;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private TaskStatus status;

    public Task() {

    }

    public Task(String name, TaskPriority priority) {
        this.name = name;
        this.priority = priority;
        this.status = TaskStatus.Pending;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public void setPriority(TaskPriority priority) {
        this.priority = priority;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public void markAsCompleted() {
        this.status = TaskStatus.Completed;
    }

    @Override
    public String toString() {
        return "Task{" + 
                "id=" + id +
                ", name='" + name + '\'' +
                ", priority=" + priority +
                ", status=" + status +
                '}';
    }
}