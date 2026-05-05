package com.task.taskmanagerapp.entities;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter @Setter
@AllArgsConstructor @NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @NotBlank(message = "first name should not be null")
    private String firstName;
    @NotBlank(message = "last name should not be null")
    private String lastName;
    @NotBlank(message = "email should not be null")
    @Email
    private String email;
    @NotBlank(message = "password should not be null")
    private String password;
    @CreatedDate
    private LocalDateTime createdAt =  LocalDateTime.now() ;
    @UpdateTimestamp
    private LocalDateTime updatedAt =  LocalDateTime.now() ;

    @OneToMany(mappedBy = "user")
    private List<Category> categories ;

    @OneToMany(mappedBy = "user")
    private List<Task> tasks;

    @OneToMany(mappedBy = "user")
    private List<Comment> comments;

    @OneToMany(mappedBy = "user")
    private List<TaskHistory> taskHistory;









}
