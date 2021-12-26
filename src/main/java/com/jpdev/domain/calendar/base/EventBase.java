package com.jpdev.domain.calendar.base;

import com.jpdev.domain.BaseEntity;
import com.jpdev.domain.User;
import com.jpdev.domain.calendar.Role;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@MappedSuperclass
public abstract class EventBase extends BaseEntity {

    @Column(nullable = false)
    private Date startDate;

    @Column(nullable = false)
    private Date finalDate;

    @OneToOne
    private User owner;

    @Column(nullable = false)
    private Role role;

    @ManyToMany
    private List<InviteUserEvent> participants;

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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<InviteUserEvent> getParticipants() {
        return participants;
    }

    public void setParticipants(List<InviteUserEvent> participants) {
        this.participants = participants;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
