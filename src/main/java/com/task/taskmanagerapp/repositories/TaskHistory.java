package com.task.taskmanagerapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskHistory extends JpaRepository<TaskHistory, Integer> {
}
