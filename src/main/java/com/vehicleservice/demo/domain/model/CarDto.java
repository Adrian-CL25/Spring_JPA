package com.vehicleservice.demo.domain.model;

import com.vehicleservice.demo.domain.entity.CarEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CarDto {



    private String name;

    private String email;

    private Integer repairRequestId;


    private Integer phone;

    private CarEntity carEntity;


}
