package com.vehicleservice.demo.service;
import com.vehicleservice.demo.model.Repair;
import com.vehicleservice.demo.model.Replacement;
import com.vehicleservice.demo.repository.RepairRepository;
import com.vehicleservice.demo.repository.ReplacementRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
@RequiredArgsConstructor
public class ReplacemetnService {
    @Autowired
    private final ReplacementRepository replacementRepository;

    public Replacement createReplacement(Replacement replacement){
        return replacementRepository.save(replacement);
    }



}
