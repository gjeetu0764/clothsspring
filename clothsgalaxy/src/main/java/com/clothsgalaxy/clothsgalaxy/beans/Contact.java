package com.clothsgalaxy.clothsgalaxy.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Contact")
public class Contact {

    private String country;

    private String email;
    private String subject;
    @Id
    private String firstname;
    private String lastname;

    public Contact() {
    }

    public Contact(String country, String email, String subject, String firstname, String lastname) {
        this.country = country;
        this.email = email;
        this.subject = subject;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Contact [country=" + country + ", email=" + email + ", subject=" + subject + ", firstname=" + firstname
                + ", lastname=" + lastname + "]";
    }

}
