package com.vehicleservice.demo.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "owner")
public class OwnerEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "owner_id")
    private Integer id;

    @Column(name = "name",
            columnDefinition = "TEXT")
    private String name;

    @Column(name = "email",
            columnDefinition = "TEXT")
    private String email;

    @Column(name = "request_id")
    private Integer repairRequestId;


    @Column(name = "phone_no")
    private Integer phone;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "owner_id", referencedColumnName = "car_id")
    private CarEntity carEntity;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "owner_request_id", referencedColumnName = "request_id")
    List<Repair> repairList = new ArrayList<>();


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "owner_request_id", referencedColumnName = "request_id")
    List<Replacement> replacementList = new ArrayList<>();



}
