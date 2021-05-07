package com.vehicleservice.demo.controller;

import com.vehicleservice.demo.model.InvoiceCreationRequest;
import com.vehicleservice.demo.model.InvoiceEntity;
import com.vehicleservice.demo.model.OwnerEntity;
import com.vehicleservice.demo.service.InvoiceService;
import com.vehicleservice.demo.service.OwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api")


public class InvoiceController {
    @Autowired
    private final InvoiceService invoiceService;

    @PostMapping(value = "/invoice/create", consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public InvoiceEntity invoiceEntity(@RequestBody @Valid InvoiceEntity invoiceEntity) {

        return invoiceService.createInvoice(invoiceEntity);
    }

    @GetMapping(value = "/invoice/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public InvoiceEntity getInvoiceById(@PathVariable(name = "id") Integer invoice_id) {
        return invoiceService.findInvById(invoice_id);
    }


    /*

    {
    "ownerId": 1,
    "repairIdsList": [1, 2, 3],
    "replacementIdsList": [2, 3]
    }
     */
    @PostMapping(value = "/invoice/createUsingRightRequest", consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public InvoiceEntity invoiceEntity(@RequestBody @Valid InvoiceCreationRequest invoiceCreationRequest) {

        return invoiceService.createInvoiceUsingCustomRequestObject(invoiceCreationRequest);
    }

}
