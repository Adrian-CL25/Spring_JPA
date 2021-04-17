package com.vehicleservice.demo.domain.model;

import com.vehicleservice.demo.domain.entity.CarEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class OwnerDto {

    private Integer id;

    private String name;

    private String email;

    private Integer repairRequestId;


    private Integer phone;

    private CarEntity carEntity;


}
