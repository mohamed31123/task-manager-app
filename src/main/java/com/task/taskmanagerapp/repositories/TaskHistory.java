package com.task.taskmanagerapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TaskHistory extends JpaRepository<TaskHistory, Long> {
    public Optional<TaskHistory> findByName(String name);
}
