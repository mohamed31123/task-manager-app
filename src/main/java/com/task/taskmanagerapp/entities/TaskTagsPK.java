package com.task.taskmanagerapp.entities;


import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;

@Embeddable
@EqualsAndHashCode
public class TaskTagsPK {
    private Long tacheId;
    private Long tagId;

    public TaskTagsPK() {
    }

    public TaskTagsPK(Long tacheId, Long tagId) {
        this.tacheId = tacheId;
        this.tagId = tagId;
    }
}
