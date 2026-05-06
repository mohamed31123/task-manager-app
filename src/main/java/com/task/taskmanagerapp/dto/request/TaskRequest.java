package com.task.taskmanagerapp.dto.request;

import com.task.taskmanagerapp.enums.TaskPriority;
import com.task.taskmanagerapp.enums.TaskStatus;

import java.time.LocalDateTime;

public record TaskRequest(
        String title ,
        String description ,
        LocalDateTime startTime ,
        LocalDateTime endTime ,
        TaskStatus taskStatus,
        TaskPriority taskPriority,
        Long userId ,
        Long categoryId

){
}
