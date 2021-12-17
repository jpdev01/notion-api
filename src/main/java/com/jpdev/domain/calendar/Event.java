package com.jpdev.domain.calendar;

import com.jpdev.domain.calendar.base.EventBase;
import com.jpdev.domain.locale.Address;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Event extends EventBase {

    @OneToOne
    private Address adreess;

    public Address getAdreess() {
        return adreess;
    }

    public void setAdreess(Address adreess) {
        this.adreess = adreess;
    }
}
