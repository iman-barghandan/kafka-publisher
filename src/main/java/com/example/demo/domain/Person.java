package com.example.demo.domain;

import java.util.Date;

public class Person {
    private Long id;
    private String name;
    private String lastname;
    private Date sendDate;

    public Person(Long id, String name, String lastname, Date sendDate) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.sendDate = sendDate;
    }

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }
}
