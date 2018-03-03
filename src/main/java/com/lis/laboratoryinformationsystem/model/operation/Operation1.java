package com.lis.laboratoryinformationsystem.model.operation;

import com.lis.laboratoryinformationsystem.model.Operation;
import com.lis.laboratoryinformationsystem.model.Test;
import com.lis.laboratoryinformationsystem.model.test.TestType;

public class Operation1 extends Operation {

    @Override
    public OperationType getOperationType() {
        return OperationType.OPERATION1;
    }

    @Override
    public Test doAction(Test test) {
        test.setProperty1(test.getProperty1() + test.getProperty2());

        if(TestType.IMMUNOLOGY.equals(test.getTestType())){
            test.setProperty4("This is immunology");
        }
        return test;
    }
}
