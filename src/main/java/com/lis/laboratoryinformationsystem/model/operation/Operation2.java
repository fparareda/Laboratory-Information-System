package com.lis.laboratoryinformationsystem.model.operation;

import com.lis.laboratoryinformationsystem.model.Operation;
import com.lis.laboratoryinformationsystem.model.Test;
import com.lis.laboratoryinformationsystem.model.test.TestType;

public class Operation2 extends Operation {

    @Override
    public OperationType getOperationType() {
        return OperationType.OPERATION2;
    }

    @Override
    public Test doAction(Test test) {
        test.setProperty3(false);

        if(TestType.BIOCHEMISTRY.equals(test.getTestType())){
            test.setProperty4("This is the operation 2");
        }
        return test;
    }
}
