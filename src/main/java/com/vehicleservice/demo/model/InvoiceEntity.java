package com.vehicleservice.demo.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "invoice")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "invoice_id", referencedColumnName = "id")
    List<Repair> repairList = new ArrayList<>();


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoiceEntity")
    List<Replacement> replacementList = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
//    @ToString.Exclude
//    @JsonIgnore
//    @EqualsAndHashCode.Exclude
    private OwnerEntity ownerEntity;

    private LocalDateTime dataEmitere;
}