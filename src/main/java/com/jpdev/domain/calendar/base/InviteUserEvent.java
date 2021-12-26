package com.jpdev.domain.calendar.base;

import com.jpdev.domain.BaseEntity;
import com.jpdev.domain.User;
import com.jpdev.domain.def.InviteStatus;
import com.jpdev.domain.def.InviteType;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class InviteUserEvent extends BaseEntity {

    @OneToOne
    private User user;

    private InviteType type;

    private InviteStatus status;
}
