package com.lis.laboratoryinformationsystem.model;

import com.lis.laboratoryinformationsystem.model.test.TestType;

public abstract class Test {
    private Long property1;
    private Long property2;
    private Boolean property3;
    private String property4;

    public Test(Long property1, Long property2, Boolean property3, String property4) {
        this.property1 = property1;
        this.property2 = property2;
        this.property3 = property3;
        this.property4 = property4;
    }

    public abstract TestType getTestType();

    public Long getProperty1() {
        return property1;
    }

    public Long getProperty2() {
        return property2;
    }

    public Boolean getProperty3() {
        return property3;
    }

    public String getProperty4() {
        return property4;
    }

    public void setProperty1(Long property1) {
        this.property1 = property1;
    }

    public void setProperty2(Long property2) {
        this.property2 = property2;
    }

    public void setProperty3(Boolean property3) {
        this.property3 = property3;
    }

    public void setProperty4(String property4) {
        this.property4 = property4;
    }
}
