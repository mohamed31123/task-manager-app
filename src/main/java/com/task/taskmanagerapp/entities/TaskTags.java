package com.task.taskmanagerapp.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
public class TaskTags {
    @EmbeddedId
    private TaskTagsPK taskTagsPK;

  @ManyToOne
  @JoinColumn(name = "tacheId")
  private Tache tache;

  @ManyToOne
  @JoinColumn(name = "tagId")
  private Tag tag;




}
