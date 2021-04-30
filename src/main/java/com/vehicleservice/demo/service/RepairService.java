package com.vehicleservice.demo.service;
import com.vehicleservice.demo.model.Repair;
import com.vehicleservice.demo.repository.RepairRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@RequiredArgsConstructor
public class RepairService {
    @Autowired
    private final RepairRepository repairRepository;

    public Repair createRepair(Repair repair){
        return repairRepository.save(repair);
    }



}
