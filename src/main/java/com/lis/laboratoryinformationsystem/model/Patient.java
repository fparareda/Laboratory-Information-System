package com.lis.laboratoryinformationsystem.model;

public class Patient {
    private Long id;
    private String name;
    private String surnaname;
    private String ssId;

    public Patient(Long id, String name, String surnaname, String ssId) {
        this.id = id;
        this.name = name;
        this.surnaname = surnaname;
        this.ssId = ssId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurnaname() {
        return surnaname;
    }

    public String getSsId() {
        return ssId;
    }
}
