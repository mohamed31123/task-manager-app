package com.task.taskmanagerapp.dto.response;

import com.task.taskmanagerapp.enums.TaskPriority;
import com.task.taskmanagerapp.enums.TaskStatus;

public record  TacheResponse(
        Long id ,
        String title ,
        String descreption ,
        TaskStatus status ,
        TaskPriority taskPriority
) {
}
