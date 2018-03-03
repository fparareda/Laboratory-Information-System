package com.lis.laboratoryinformationsystem.service;

import com.lis.laboratoryinformationsystem.model.Operation;

import javax.validation.Valid;
import java.util.List;

public interface TestManagerService {
    void doOperationOverOrder(Long orderId, List<Long> operationIdList);
}
