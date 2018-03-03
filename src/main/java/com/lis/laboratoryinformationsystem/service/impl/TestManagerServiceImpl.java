package com.lis.laboratoryinformationsystem.service.impl;

import com.lis.laboratoryinformationsystem.model.Operation;
import com.lis.laboratoryinformationsystem.model.Order;
import com.lis.laboratoryinformationsystem.model.Test;
import com.lis.laboratoryinformationsystem.model.operation.Operation1;
import com.lis.laboratoryinformationsystem.service.TestManagerService;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.Collection;
import java.util.List;

@Service
public class TestManagerServiceImpl implements TestManagerService {

    @Override
    public void doOperationOverOrder(Long orderId, List<Long> operationIdList) {
        for (Long operationId : operationIdList) {
            doOperation(getOperation(operationId), getOrder(orderId).getTests());
        }
    }

    private void doOperation(Operation operation, Collection<Test> tests) {
        for (Test test : tests) {
            operation.doAction(test);
        }
    }

    private Operation getOperation(long operationId) {
        // TODO: get the Operation1 from DB
        return new Operation1();
    }

    private Order getOrder(long orderId) {
        // TODO: get the Order from DB
        return new Order();
    }
}
