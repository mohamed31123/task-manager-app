package com.task.taskmanagerapp.dto.request;

import java.time.LocalDateTime;



public record UserRequest (
        String firstName ,
        String lastName ,
        String email ,
        String password ,
        LocalDateTime createdAt ,
        LocalDateTime updatedAt
){
}
