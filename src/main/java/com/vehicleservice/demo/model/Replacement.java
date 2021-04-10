package com.vehicleservice.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "replacement")
public class Replacement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "replacement_id")
    private Integer id;

    @Column(name = "task_name")
    private String task_name;

    @Column(name = "price")
    private String price;
}
