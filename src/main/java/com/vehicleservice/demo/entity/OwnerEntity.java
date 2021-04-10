package com.vehicleservice.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "owner")
public class OwnerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "owner_id")
    private Long id;

    @Column(name = "name",
            columnDefinition = "TEXT")
    private String name;

    @Column(name = "email",
            columnDefinition = "TEXT")
    private String email;


    @Column(name = "phone_no")
    private Integer phone;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "owner_id",referencedColumnName = "car_id")
   private CarEntity carEntity;
}
