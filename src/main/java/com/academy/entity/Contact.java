package com.academy.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Marek Słomnicki <marek@slomnicki.net>
 */
@Embeddable
public class Contact {

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE")
    private String phone;

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
}
