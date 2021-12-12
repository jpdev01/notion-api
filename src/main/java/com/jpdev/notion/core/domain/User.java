package com.jpdev.notion.core.domain;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class User extends BaseEntity {

    private String name;

    private String email;

    private String phone;

    private String mobilePhone;

    private String password;

    private Date lastLogin;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
}
