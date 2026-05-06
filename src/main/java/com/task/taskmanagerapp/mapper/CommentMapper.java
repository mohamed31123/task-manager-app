package com.task.taskmanagerapp.mapper;

import com.task.taskmanagerapp.dto.request.CommentRequest;
import com.task.taskmanagerapp.dto.response.CommentResponse;
import com.task.taskmanagerapp.entities.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface CommentMapper {
    Comment toEntity(CommentRequest commentRequest);
    CommentResponse toResponse(Comment comment);
    void updateComment(CommentRequest commentRequest , @MappingTarget Comment comment);
}
