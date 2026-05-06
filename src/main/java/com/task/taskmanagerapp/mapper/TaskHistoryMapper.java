package com.task.taskmanagerapp.mapper;


import com.task.taskmanagerapp.dto.request.TaskHistoryRequest;
import com.task.taskmanagerapp.dto.response.TaskHistoryResponse;
import com.task.taskmanagerapp.entities.TaskHistory;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface TaskHistoryMapper {
    TaskHistory toEntity(TaskHistoryRequest taskHistoryRequest);
    TaskHistoryResponse toResponse(TaskHistory toEntity);
    void updateTaskHistory(TaskHistoryRequest taskHistoryRequest , @MappingTarget TaskHistory taskHistory);

}
