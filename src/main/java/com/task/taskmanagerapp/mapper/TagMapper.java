package com.task.taskmanagerapp.mapper;


import com.task.taskmanagerapp.dto.request.TagRequest;
import com.task.taskmanagerapp.dto.response.TagResponse;
import com.task.taskmanagerapp.entities.Tag;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface TagMapper {
    Tag toEntity(TagRequest tagRequest);
    TagResponse toResponse(Tag toEntity);
    void updateTag(TagRequest tagRequest , @MappingTarget Tag tag);
}
