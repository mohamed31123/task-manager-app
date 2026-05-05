package com.task.taskmanagerapp.repositories;

import com.task.taskmanagerapp.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface TaskRepo extends JpaRepository<Task, Integer> {
    public Optional<Task> findByName(String name);
    public Optional<Task> findByNameAndId(String name, Integer id);
    public Optional<Task> findByNameAndIdAndVersion(Integer name, Integer id, Integer version);
}
