package com.task.taskmanagerapp.mapper;


import com.task.taskmanagerapp.dto.request.UserRequest;
import com.task.taskmanagerapp.dto.response.UserResponse;
import com.task.taskmanagerapp.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(UserRequest userRequest);
    UserResponse toResponse(User toEntity);
    void updateUser(UserRequest userRequest , @MappingTarget User user);
}
