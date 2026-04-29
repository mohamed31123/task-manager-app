package com.task.taskmanagerapp.repositories;

import com.task.taskmanagerapp.entities.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TagRepo extends JpaRepository<Tag, Integer> {
}
