package com.task.taskmanagerapp.dto.request;

import java.time.LocalDateTime;

public record TachRequest (
        String title ,
        String description ,
        LocalDateTime startTime ,
        LocalDateTime endTime ,
        Long userId ,
        Long categoryId

){
}
