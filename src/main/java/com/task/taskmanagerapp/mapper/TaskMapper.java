package com.task.taskmanagerapp.mapper;

import com.task.taskmanagerapp.dto.request.TaskRequest;
import com.task.taskmanagerapp.dto.response.TacheResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.scheduling.config.Task;

@Mapper(componentModel = "spring")
public interface TaskMapper {
    Task toEntity(TaskRequest dto);
    TacheResponse toResponse(Task task);
    void update(TaskRequest request, @MappingTarget Task task);


}
