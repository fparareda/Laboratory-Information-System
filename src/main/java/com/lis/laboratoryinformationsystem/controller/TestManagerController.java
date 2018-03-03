package com.lis.laboratoryinformationsystem.controller;

import com.lis.laboratoryinformationsystem.model.Operation;
import com.lis.laboratoryinformationsystem.service.OperationService;
import com.lis.laboratoryinformationsystem.service.TestManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/operations")
public class TestManagerController {

    private final TestManagerService testManagerService;
    private final OperationService operationService;

    @Autowired
    public TestManagerController(final TestManagerService testManagerService, OperationService operationService) {
        this.testManagerService = testManagerService;
        this.operationService = operationService;
    }

    @PutMapping
    public void newOperation(@Valid @RequestBody Operation operation) {
        operationService.createOperation(operation);
    }

    @PostMapping("/{orderId}")
    public void applyOperation(@Valid @PathVariable Long orderId, @Valid @RequestBody List<Long> operationIdList) {
        testManagerService.doOperationOverOrder(orderId, operationIdList);
    }
}
