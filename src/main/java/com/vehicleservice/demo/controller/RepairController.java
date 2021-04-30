package com.vehicleservice.demo.controller;

import com.vehicleservice.demo.model.OwnerEntity;
import com.vehicleservice.demo.model.Repair;
import com.vehicleservice.demo.repository.RepairRepository;
import com.vehicleservice.demo.service.RepairService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class RepairController {
    private final RepairService repairService;

    @PostMapping(value = "/repair/create", consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public Repair createRepair(@RequestBody @Valid Repair repair) {

        return repairService.createRepair(repair);
    }


    @GetMapping(value = "/repairs", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Repair> getRepair() {
        return repairService.getRepairRepository().findAll();
    }
}
