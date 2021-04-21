package com.vehicleservice.demo.domain.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "repair")
public class Repair implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "repair_id")
    private Integer id;

    @Column(name = "task_name")
    private String task_name;

    @Column(name = "price")
    private String price;

}
