package com.vehicleservice.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "replacement")
public class Replacement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "replacement_id")
    private Integer id;

    @Column(name = "task_name")
    private String task_name;

    @Column(name = "price")
    private String price;


    @Column(name="owner_request_id")
    private int owner_request_id;
}
