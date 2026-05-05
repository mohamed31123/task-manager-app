package com.task.taskmanagerapp.entities;


import com.task.taskmanagerapp.enums.TaskPriority;
import com.task.taskmanagerapp.enums.TaskStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private  String description;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    @Enumerated(EnumType.STRING)
    private TaskPriority priority;

    private LocalDate dueDate;

    @CreationTimestamp
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    @UpdateTimestamp
    private LocalTime updateTime;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;

    @OneToMany(mappedBy = "task")
    private List<Comment> comments;

    @OneToMany(mappedBy = "task")
    private List<Tag> tags;

    @OneToMany(mappedBy = "task")
    private List<TaskHistory> taskHistories;


}

