package com.task.taskmanagerapp.entities;


import com.task.taskmanagerapp.enums.TaskStatus;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.scheduling.config.Task;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Tache {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private  String description;
    @CreatedDate
    private LocalDateTime creationDate;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    private LocalDateTime deadline;

    private int EstimatedHours ;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;


    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;


    @OneToMany(mappedBy = "tache")
    private List<Comment> comments;

    @OneToMany(mappedBy = "tache")
    private List<TaskHistory> taskHistories;

    @OneToMany
    private List<TaskTags> taskTags;


}
