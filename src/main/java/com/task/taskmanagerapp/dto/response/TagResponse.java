package com.task.taskmanagerapp.dto.response;

import java.time.LocalDateTime;

public record TagResponse(
        Long id ,
        String name ,
        String color ,
        LocalDateTime  createdAt ,
        String taskName
) {
}
