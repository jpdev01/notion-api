package com.jpdev.notion.core.domain.calendar.base;

import com.jpdev.notion.core.domain.BaseEntity;
import com.jpdev.notion.core.domain.User;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@MappedSuperclass
public abstract class EventBase extends BaseEntity {

    @Column(nullable = false)
    private Date startDate;

    @Column(nullable = false)
    private Date finalDate;

    @ManyToOne
    @Column(nullable = false)
    private User owner;

    @ManyToMany
    private List<User> participants;

    String description;

    // mapear uma coluna para repete em.
    // private List<RepeatAt> repeatAt;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(Date finalDate) {
        this.finalDate = finalDate;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public List<User> getParticipants() {
        return participants;
    }

    public void setParticipants(List<User> participants) {
        this.participants = participants;
    }
}
