package com.task.taskmanagerapp.repositories;

import com.task.taskmanagerapp.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Optional;

@ResponseStatus
public interface CategoryRepo  extends JpaRepository<Category, Integer> {
    public Optional<Category> findByName(String name);
    public Category findByNameAndId(String name, Integer id);

}
