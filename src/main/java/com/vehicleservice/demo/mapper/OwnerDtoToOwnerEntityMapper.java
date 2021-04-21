package com.vehicleservice.demo.mapper;

import com.vehicleservice.demo.domain.entity.CarEntity;
import com.vehicleservice.demo.domain.entity.OwnerEntity;
import com.vehicleservice.demo.domain.entity.Repair;
import com.vehicleservice.demo.domain.model.OwnerDto;
import com.vehicleservice.demo.repository.RepairRepository;
import com.vehicleservice.demo.repository.ReplacementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class OwnerDtoToOwnerEntityMapper {

    public final RepairRepository repairRepository;
    public final ReplacementRepository replacementRepository;


    public OwnerEntity mapDtoToEntity(OwnerDto dto){
        return OwnerEntity.builder()
                .email(dto.getEmail())
                .name(dto.getName())
                .phone(dto.getPhone())
                .carEntity(dto.getCarEntity())
                .repairList(repairRepository.findAllById(dto.getRepairIdsList()))
                .replacementList(replacementRepository.findAllById(dto.getReplacementIdsList()))
                .build();
    }







}
