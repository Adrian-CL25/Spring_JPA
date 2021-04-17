package com.vehicleservice.demo.controller;

import com.vehicleservice.demo.domain.model.OwnerDto;
import com.vehicleservice.demo.domain.entity.OwnerEntity;
import com.vehicleservice.demo.service.OwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api")


public class OwnerController {
    @Autowired
    private final OwnerService ownerService;


    @GetMapping(value = "/owner/{ownerId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public OwnerEntity getOwnerById(@PathVariable(name = "ownerId") Integer owner_id) {
        return ownerService.findOwnerById(owner_id);
    }

    @GetMapping(value = "/owners", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<OwnerDto> getOwners() {
        return ownerService.getAllOwners();
    }


    @PutMapping(value = "/add/{id}", consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public OwnerEntity ownerEntity(@PathVariable(name = "id") Integer id,
                                   @RequestBody @Valid OwnerEntity ownerEntity) {
        ownerEntity.setId(id);
        ownerEntity.setCarEntity(ownerEntity.getCarEntity());
        return ownerService.addNewOwner(ownerEntity);
    }







}
