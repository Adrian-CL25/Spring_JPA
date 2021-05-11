package com.vehicleservice.demo.model;


import java.util.List;

import lombok.Data;

@Data
public class InvoiceCreationRequest {

    List<Integer> repairIdsList;

    List<Integer> replacementIdsList;

    private Integer ownerId;


//    private LocalDateTime dataEmitere; pe asta nu mai e nevoie sa o punem in request,
    // o vom seta la data+ora curenta
}
