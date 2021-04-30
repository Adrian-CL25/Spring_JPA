package com.vehicleservice.demo.model;

import lombok.Data;


import javax.persistence.*;


@Data
@Entity
@Table(name = "car")
public class CarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private Integer id;


    @Column(name = "marca")
    private String marca;


    @Column(name = "model",
            columnDefinition = "TEXT")
    private String model;


    @Column(name = "fab_year")
    private Integer fabYear;

}