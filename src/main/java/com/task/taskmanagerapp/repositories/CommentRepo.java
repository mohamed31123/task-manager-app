package com.task.taskmanagerapp.repositories;

import com.task.taskmanagerapp.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface CommentRepo extends JpaRepository<Comment, Integer> {
    public Optional<Comment> findByName(String name);

}
