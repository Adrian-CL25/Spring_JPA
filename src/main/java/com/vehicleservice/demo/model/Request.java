package com.vehicleservice.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "request")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "request_id")
    private Integer id;

}
