package com.task.taskmanagerapp.repositories;

import com.task.taskmanagerapp.entities.Tache;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TacheRepo extends JpaRepository<Tache, Integer> {
}
