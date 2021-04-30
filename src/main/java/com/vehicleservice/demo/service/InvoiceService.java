package com.vehicleservice.demo.service;

import com.vehicleservice.demo.model.InvoiceEntity;
import com.vehicleservice.demo.model.OwnerEntity;
import com.vehicleservice.demo.model.Repair;
import com.vehicleservice.demo.model.Replacement;
import com.vehicleservice.demo.repository.InvoiceRepository;
import com.vehicleservice.demo.repository.OwnerRepository;
import com.vehicleservice.demo.repository.RepairRepository;
import com.vehicleservice.demo.repository.ReplacementRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@RequiredArgsConstructor
public class InvoiceService {
    @Autowired
    private final InvoiceRepository invoiceRepository;


    public InvoiceEntity createInvoice(InvoiceEntity invoiceEntity) {
        return invoiceRepository.save(invoiceEntity);
    }

    public InvoiceEntity findInvById(Integer id) {
        return invoiceRepository.findById(id).orElseThrow(null);
    }




}
