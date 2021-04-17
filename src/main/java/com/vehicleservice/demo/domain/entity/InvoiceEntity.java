package com.vehicleservice.demo.domain.entity;


import javax.persistence.*;

@Entity
public class InvoiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


}
