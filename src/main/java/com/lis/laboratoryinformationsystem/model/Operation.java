package com.lis.laboratoryinformationsystem.model;

import com.lis.laboratoryinformationsystem.model.operation.OperationType;

public abstract class Operation {

    private Long id;

    public Operation() { }

    public Operation(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public abstract OperationType getOperationType();

    public abstract Test doAction(Test test);
}
