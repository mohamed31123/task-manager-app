package com.task.taskmanagerapp.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "name should not be null")
    private String name;
    @NotEmpty(message = "color should not be null")
    private String color ;
    @CreatedDate
    private LocalDateTime createdAt = LocalDateTime.now();


    //la relation entre user et category
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

}
