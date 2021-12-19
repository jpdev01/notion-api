package com.jpdev.domain.notes;

import com.jpdev.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
public class Note extends BaseEntity {

    @Column(columnDefinition = "TEXT")
    private String content;

    @OneToMany
    private List<Note> subNotes;
}
