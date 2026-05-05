package com.task.taskmanagerapp.dto.request;

import org.springframework.stereotype.Component;

@Component
public record TaskHistoryRequest (
        String title ,
        String descreption
){
}
