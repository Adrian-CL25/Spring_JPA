package com.vehicleservice.demo.service;

import com.vehicleservice.demo.model.InvoiceCreationRequest;
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

import java.time.LocalDateTime;
import java.util.List;

@Service
@Data
@RequiredArgsConstructor
public class InvoiceService {
    @Autowired
    private final InvoiceRepository invoiceRepository;
    private final RepairRepository repairRepository;
    private final ReplacementRepository replacementRepository;
    private final OwnerRepository ownerRepository;


    public InvoiceEntity createInvoiceUsingCustomRequestObject(InvoiceCreationRequest invoiceCreationRequest) {

        var ownerEntity = ownerRepository.findById(invoiceCreationRequest.getOwnerId()).get();
        var repairs = repairRepository.findAllById(invoiceCreationRequest.getRepairIdsList());
        var replacements = replacementRepository.findAllById(invoiceCreationRequest.getReplacementIdsList());
        InvoiceEntity invoiceEntity = InvoiceEntity.builder()
                                                   .dataEmitere(LocalDateTime.now())
                                                   .ownerEntity(ownerEntity)// facem legatura cu intrarile deja existente
                                                   .repairList(repairs)
                                                   .replacementList(replacements)
                                                   .build();
        // facem legatura si invers
        repairs.forEach(repair -> repair.setInvoiceEntity(invoiceEntity));
        replacements.forEach(replacement -> replacement.setInvoiceEntity(invoiceEntity));

        return invoiceRepository.save(invoiceEntity);
    }

    public InvoiceEntity findInvById(Integer id) {
        return invoiceRepository.findById(id).orElseThrow(null);
    }




}
