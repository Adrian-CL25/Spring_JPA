package com.vehicleservice.demo.model;


import javax.persistence.*;

@Entity
public class InvoiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "owner_id",referencedColumnName = "id")
    private OwnerEntity ownerEntity;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "request_id",referencedColumnName = "id")
    private Request request;


    private Double totalPrice;
}
