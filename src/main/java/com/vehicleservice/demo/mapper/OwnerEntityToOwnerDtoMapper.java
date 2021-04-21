package com.vehicleservice.demo.mapper;
import com.vehicleservice.demo.domain.entity.CarEntity;
import com.vehicleservice.demo.domain.entity.Repair;
import com.vehicleservice.demo.domain.model.OwnerDto;
import com.vehicleservice.demo.domain.entity.OwnerEntity;
import com.vehicleservice.demo.repository.RepairRepository;
import com.vehicleservice.demo.repository.ReplacementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
@Component
@RequiredArgsConstructor
public class OwnerEntityToOwnerDtoMapper{
    public final RepairRepository repairRepository;
    public final ReplacementRepository replacementRepository;

    public OwnerDto mapEntityToDto(OwnerEntity ownerEntity){
        return OwnerDto.builder()
                .email(ownerEntity.getEmail())
                .name(ownerEntity.getName())
                .phone(ownerEntity.getPhone())
                .carEntity(ownerEntity.getCarEntity())
                .build();
    }





}
