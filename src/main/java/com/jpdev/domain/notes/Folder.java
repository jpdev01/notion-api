package com.jpdev.domain.notes;

import com.jpdev.domain.BaseEntity;

import javax.persistence.Entity;

@Entity
public class Folder extends BaseEntity {

    private String name;

    private Integer order;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}
