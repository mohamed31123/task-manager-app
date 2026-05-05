package com.task.taskmanagerapp.repositories;

import com.task.taskmanagerapp.entities.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface TagRepo extends JpaRepository<Tag, Integer> {
    public Optional<Tag> findByNameAndId(String name, Integer id);
    public Optional<Tag> findByNameAndIdAndVersion(Integer name, Integer id, Integer version);
}
