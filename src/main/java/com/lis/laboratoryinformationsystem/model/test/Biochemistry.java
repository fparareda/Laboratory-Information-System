package com.lis.laboratoryinformationsystem.model.test;

import com.lis.laboratoryinformationsystem.model.Test;

public class Biochemistry extends Test {
    private String biochemistryProperty1;
    private String biochemistryProperty2;
    private String biochemistryProperty3;

    public Biochemistry(Long property1, Long property2, Boolean property3, String property4, String biochemistryProperty1,
                        String biochemistryProperty2, String biochemistryProperty3) {
        super(property1, property2, property3, property4);
        this.biochemistryProperty1 = biochemistryProperty1;
        this.biochemistryProperty2 = biochemistryProperty2;
        this.biochemistryProperty3 = biochemistryProperty3;
    }

    @Override
    public TestType getTestType() {
        return TestType.BIOCHEMISTRY;
    }

    public String getBiochemistryProperty1() {
        return biochemistryProperty1;
    }

    public String getBiochemistryProperty2() {
        return biochemistryProperty2;
    }

    public String getBiochemistryProperty3() {
        return biochemistryProperty3;
    }
}
