package com.task.taskmanagerapp.entities;


import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.scheduling.config.Task;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String content;
    @CreatedDate
    private LocalDateTime createdDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;

}
