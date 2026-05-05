package com.task.taskmanagerapp.entities;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String color;
    @CreatedDate
    private LocalDateTime createdAt = LocalDateTime.now();

    @OneToMany
    @JoinColumn(name = "id_task")
    private Task task ;



}
