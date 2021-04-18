package com.vehicleservice.demo.mapper;

import com.vehicleservice.demo.domain.entity.CarEntity;
import com.vehicleservice.demo.domain.entity.OwnerEntity;
import com.vehicleservice.demo.domain.entity.Repair;
import com.vehicleservice.demo.domain.model.OwnerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OwnerDtoToOwnerEntityMapper {
    public CarEntity carEntity;
    public Repair repair;

    public OwnerEntity mapDtoToEntity(OwnerDto dto){
        return OwnerEntity.builder()
//                .id(dto.getId())
                .email(dto.getEmail())
                .name(dto.getName())
                .phone(dto.getPhone())
                .repairRequestId(dto.getRepairRequestId())
                .carEntity(dto.getCarEntity())
                .build();
    }





}
