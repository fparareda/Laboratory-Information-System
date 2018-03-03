package com.lis.laboratoryinformationsystem.model.test;

import com.lis.laboratoryinformationsystem.model.Test;

public class Hematology extends Test {
    private String  hematologyProperty1;
    private String  hematologyProperty2;
    private String  hematologyProperty3;

    public Hematology(Long property1, Long property2, Boolean property3, String property4, String hematologyProperty1,
                      String hematologyProperty2, String hematologyProperty3) {
        super(property1, property2, property3, property4);
        this.hematologyProperty1 = hematologyProperty1;
        this.hematologyProperty2 = hematologyProperty2;
        this.hematologyProperty3 = hematologyProperty3;
    }

    @Override
    public TestType getTestType() {
        return TestType.HEMATOLOGY;
    }

    public String getHematologyProperty1() {
        return hematologyProperty1;
    }

    public String getHematologyProperty2() {
        return hematologyProperty2;
    }

    public String getHematologyProperty3() {
        return hematologyProperty3;
    }
}
