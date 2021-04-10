package com.vehicleservice.demo.controller;

import com.vehicleservice.demo.model.CarEntity;
import com.vehicleservice.demo.model.OwnerEntity;
import com.vehicleservice.demo.service.CarService;
import com.vehicleservice.demo.service.OwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;



@RestController
@RequiredArgsConstructor
@RequestMapping("/")


public class OwnerController {
    @Autowired
    private final OwnerService ownerService;
    @Autowired
    private final CarService carService;

    @GetMapping(value = "/owner/{ownerId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public OwnerEntity getOwnerById(@PathVariable(name = "ownerId") Integer owner_id) {
        return ownerService.findOwnerById(owner_id);
    }



}
