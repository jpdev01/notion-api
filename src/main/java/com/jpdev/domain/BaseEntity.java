package com.jpdev.domain;

import com.jpdev.validation.CustomError;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @CreationTimestamp
    private Date dateCreated;

    @UpdateTimestamp
    private Date lastUpdated;

    @Transient
    private List<CustomError> errors;

    public Integer getId(){
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public List<CustomError> getErrors() {
        return errors;
    }

    public void addErrors(List<CustomError> customErrors) {
        if (this.errors == null) this.errors = new ArrayList<>();
        this.errors.addAll(customErrors);
    }

    public void addError(CustomError customError) {
        if (this.errors == null) this.errors = new ArrayList<>();
        this.errors.add(customError);
    }

    public boolean hasErrors(){
        return this.errors != null || !this.errors.isEmpty();
    }
}
