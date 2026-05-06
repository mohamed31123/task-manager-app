package com.task.taskmanagerapp.mapper;

import com.task.taskmanagerapp.dto.request.CategoryRequest;
import com.task.taskmanagerapp.dto.response.CategoryResponse;
import com.task.taskmanagerapp.entities.Category;
import jakarta.validation.Valid;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spirng")
public interface CategoryMapper {
    Category toEntity(CategoryRequest request);
    CategoryResponse toResponse(Category category);
    void updateCategory(@MappingTarget Category category , @Valid CategoryRequest request);
}
