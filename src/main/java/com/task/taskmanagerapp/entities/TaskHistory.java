package com.task.taskmanagerapp.entities;


import jakarta.persistence.*;
import org.springframework.scheduling.config.Task;

@Entity
public class TaskHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String oldValue;
    private String newValue;
    @ManyToOne
    @JoinColumn(name = "taskId")
    private Task task;

    @ManyToOne
    @JoinColumn(name = "taskHistoryId")
    private User user;
}
