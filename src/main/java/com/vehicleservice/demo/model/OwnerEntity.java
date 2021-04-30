package com.vehicleservice.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
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


    @Column(name = "phone_no")
    private Integer phone;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "car_id", referencedColumnName = "car_id")
    private CarEntity carEntity;


}