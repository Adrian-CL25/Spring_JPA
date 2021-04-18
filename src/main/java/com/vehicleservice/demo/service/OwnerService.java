package com.vehicleservice.demo.service;


import com.vehicleservice.demo.domain.entity.Repair;
import com.vehicleservice.demo.domain.model.OwnerDto;
import com.vehicleservice.demo.domain.entity.OwnerEntity;

import com.vehicleservice.demo.mapper.OwnerDtoToOwnerEntityMapper;
import com.vehicleservice.demo.mapper.OwnerEntityToOwnerDtoMapper;
import com.vehicleservice.demo.repository.OwnerRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Data
@RequiredArgsConstructor
public class OwnerService {
    @Autowired
    private final OwnerRepository ownerRepository;
    private final OwnerEntityToOwnerDtoMapper ownerEntityToOwnerDtoMapper;
    private final OwnerDtoToOwnerEntityMapper ownerDtoToOwnerEntityMapper;


    public List<OwnerDto> getAllOwners() {
        return ownerRepository.findAll().stream()
                .map(ownerEntityToOwnerDtoMapper::mapEntityToDto)
                .collect(Collectors.toList());
    }


    public OwnerEntity findOwnerById(Integer id) {
        return ownerRepository.findById(id).orElseThrow(null);
    }

    public OwnerEntity addNewOwner(OwnerEntity newOwner) {
        return ownerRepository.save(newOwner);
    }


    public OwnerDto createOwner(OwnerDto ownerDto) {
        OwnerEntity ownerEntity = ownerDtoToOwnerEntityMapper.mapDtoToEntity(ownerDto);
        OwnerEntity savedOwner = ownerRepository.save(ownerEntity);
        return  ownerEntityToOwnerDtoMapper.mapEntityToDto(savedOwner);

    }
}






