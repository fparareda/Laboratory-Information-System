package com.lis.laboratoryinformationsystem.model;

import java.util.Collection;

public class Order {

    private Long id;
    private Collection<Test> tests;
    private Patient patient;

    public Order() {
    }

    public Order(Long id, Collection<Test> tests, Patient patient) {
        this.id = id;
        this.tests = tests;
        this.patient = patient;
    }

    public Long getId() {
        return id;
    }

    public Collection<Test> getTests() {
        return tests;
    }

    public Patient getPatient() {
        return patient;
    }
}
