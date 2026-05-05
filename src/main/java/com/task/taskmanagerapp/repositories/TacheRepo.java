package com.task.taskmanagerapp.repositories;

import com.task.taskmanagerapp.entities.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface TacheRepo extends JpaRepository<Tache, Integer> {
    public Optional<Tache> findByName(String name);
    public Optional<Tache> findByNameAndId(String name, Integer id);
    public Optional<Tache> findByNameAndIdAndVersion(Integer name, Integer id, Integer version);
}
