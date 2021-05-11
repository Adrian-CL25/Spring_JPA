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
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


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


        Integer repairPriceList = repairRepository.findAllById(invoiceCreationRequest.getRepairIdsList()).stream()
                .filter(r-> r.getPrice() != null)
                .mapToInt(x -> Integer.parseInt(x.getPrice())).sum();

        Integer replacementPriceList = replacementRepository.findAllById(invoiceCreationRequest.getReplacementIdsList()).stream()
                .filter(y-> y.getPrice() != null)
                .mapToInt(x -> Integer.parseInt(x.getPrice())).sum();

        Integer totalPriceRepairAndReplacement = repairPriceList + replacementPriceList;






        InvoiceEntity invoiceEntity = InvoiceEntity.builder()
                .dataEmitere(LocalDateTime.now())
                .totalPrice(totalPriceRepairAndReplacement)
                .ownerEntity(ownerEntity)
                .repairList(repairs)
                .replacementList(replacements)
                .build();



        repairs.forEach(repair -> repair.setInvoiceEntity(invoiceEntity));
        replacements.forEach(replacement -> replacement.setInvoiceEntity(invoiceEntity));


        return invoiceRepository.save(invoiceEntity);


    }


    public InvoiceEntity findInvById(Integer id) {
        return invoiceRepository.findById(id).orElseThrow(null);
    }


}
