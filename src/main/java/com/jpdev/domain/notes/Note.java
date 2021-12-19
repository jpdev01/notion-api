package com.jpdev.domain.notes;

import com.jpdev.domain.BaseEntity;
import com.jpdev.domain.User;

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

    @OneToOne
    private User owner;

    @OneToMany
    private List<Category> categories;

    @OneToOne
    private Folder folder;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Note> getSubNotes() {
        return subNotes;
    }

    public void setSubNotes(List<Note> subNotes) {
        this.subNotes = subNotes;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
