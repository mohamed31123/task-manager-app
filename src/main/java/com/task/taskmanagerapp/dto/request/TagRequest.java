package com.task.taskmanagerapp.dto.request;

import java.time.LocalDateTime;

public record TagRequest (
    String name ,
    String color ,
    LocalDateTime createdAt ,
    Long taskId
){
}
