package com.lis.laboratoryinformationsystem.service.impl;

import com.lis.laboratoryinformationsystem.model.Operation;
import com.lis.laboratoryinformationsystem.model.Order;
import com.lis.laboratoryinformationsystem.model.Test;
import com.lis.laboratoryinformationsystem.model.operation.Operation1;
import com.lis.laboratoryinformationsystem.service.OperationService;
import com.lis.laboratoryinformationsystem.service.TestManagerService;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.Collection;
import java.util.List;

@Service
public class OperationServiceImpl implements OperationService {

    @Override
    public void createOperation(@Valid Operation operation) {
        // TODO: Save into DB the new Operation
    }
}
