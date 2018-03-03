package com.lis.laboratoryinformationsystem.model.test;

import com.lis.laboratoryinformationsystem.model.Test;

public class Microbiology extends Test {
    private String  microbiologyProperty1;
    private String  microbiologyProperty2;
    private String  microbiologyProperty3;

    public Microbiology(Long property1, Long property2, Boolean property3, String property4,
                        String microbiologyProperty1, String microbiologyProperty2, String microbiologyProperty3) {
        super(property1, property2, property3, property4);
        this.microbiologyProperty1 = microbiologyProperty1;
        this.microbiologyProperty2 = microbiologyProperty2;
        this.microbiologyProperty3 = microbiologyProperty3;
    }

    @Override
    public TestType getTestType() {
        return TestType.MICROBIOLOGY;
    }

    public String getMicrobiologyProperty1() {
        return microbiologyProperty1;
    }

    public String getMicrobiologyProperty2() {
        return microbiologyProperty2;
    }

    public String getMicrobiologyProperty3() {
        return microbiologyProperty3;
    }
}
