package com.jpdev.domain.locale;

import com.jpdev.domain.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Address extends BaseEntity {

    @Column(nullable = false)
    String country;

    @Column(nullable = false)
    String state;

    @Column(nullable = false)
    String city;

    @Column(nullable = false)
    String district;

    String address;

    Long number;

    String complement;
}
