package com.vehicleservice.demo.mapper;
import com.vehicleservice.demo.domain.entity.CarEntity;
import com.vehicleservice.demo.domain.entity.Repair;
import com.vehicleservice.demo.domain.model.OwnerDto;
import com.vehicleservice.demo.domain.entity.OwnerEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
@Component
@RequiredArgsConstructor
public class OwnerEntityToOwnerDtoMapper{
    public CarEntity carEntity;

    public OwnerDto mapEntityToDto(OwnerEntity ownerEntity){
        return OwnerDto.builder()
                .id(ownerEntity.getId())
                .email(ownerEntity.getEmail())
                .name(ownerEntity.getName())
                .phone(ownerEntity.getPhone())
                .repairRequestId(ownerEntity.getRepairRequestId())
                .carEntity(ownerEntity.getCarEntity())
                .build();
    }





}
