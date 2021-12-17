package com.jpdev.notion.core.domain.calendar;

import com.jpdev.notion.core.domain.calendar.base.EventBase;
import com.jpdev.notion.core.domain.locale.Address;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Event extends EventBase {

    @OneToOne
    private Address adreess;
}
