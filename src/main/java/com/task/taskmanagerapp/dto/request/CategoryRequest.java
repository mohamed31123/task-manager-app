package com.task.taskmanagerapp.dto.request;

import java.time.LocalDateTime;

public record CategoryRequest(
        String name ,
        String color ,
        LocalDateTime createdAt ,LocalDateTime updatedAt ,
        Long userId


) {
}
