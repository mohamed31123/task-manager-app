package com.task.taskmanagerapp.repositories;

import com.task.taskmanagerapp.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public interface CategoryRepo  extends JpaRepository<Category, Integer> {
}
