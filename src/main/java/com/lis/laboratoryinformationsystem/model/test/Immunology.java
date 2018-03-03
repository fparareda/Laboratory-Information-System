package com.lis.laboratoryinformationsystem.model.test;

import com.lis.laboratoryinformationsystem.model.Test;

public class Immunology extends Test {
    private String  immunologyProperty1;
    private String  immunologyProperty2;
    private String  immunologyProperty3;

    public Immunology(Long property1, Long property2, Boolean property3, String property4,
                      String immunologyProperty1, String immunologyProperty2, String immunologyProperty3) {
        super(property1, property2, property3, property4);
        this.immunologyProperty1 = immunologyProperty1;
        this.immunologyProperty2 = immunologyProperty2;
        this.immunologyProperty3 = immunologyProperty3;
    }

    @Override
    public TestType getTestType() {
        return TestType.IMMUNOLOGY;
    }

    public String getImmunologyProperty1() {
        return immunologyProperty1;
    }

    public String getImmunologyProperty2() {
        return immunologyProperty2;
    }

    public String getImmunologyProperty3() {
        return immunologyProperty3;
    }
}
