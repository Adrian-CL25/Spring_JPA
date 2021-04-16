package com.vehicleservice.demo.service;


import com.vehicleservice.demo.model.OwnerEntity;

import com.vehicleservice.demo.repository.OwnerRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
@RequiredArgsConstructor
public class OwnerService {
    @Autowired
    private final OwnerRepository ownerRepository;


    public OwnerEntity findOwnerById(Integer id) {
        return ownerRepository.findById(id).orElseThrow(null);
    }

    public OwnerEntity addNewOwner(OwnerEntity newOwner) {
        return ownerRepository.save(newOwner);
    }



}
