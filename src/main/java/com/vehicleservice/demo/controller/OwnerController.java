package com.vehicleservice.demo.controller;

import com.vehicleservice.demo.model.OwnerEntity;
import com.vehicleservice.demo.service.OwnerService;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldNameConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;


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
    public List<OwnerEntity> getOwners() {
        return ownerService.getOwnerRepository().findAll();
    }


    @PostMapping(value = "/owner/create", consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public OwnerEntity ownerEntity(@RequestBody @Valid OwnerEntity ownerEntity) {

        return ownerService.addNewOwner(ownerEntity);
    }

    @PutMapping(value = "/add/{id}", consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public OwnerEntity ownerEntity(@PathVariable(name = "id") Integer id,
                                   @RequestBody @Valid OwnerEntity ownerEntity) {
        ownerEntity.setId(id);
        ownerEntity.setCarEntity(ownerEntity.getCarEntity());
        return ownerService.addNewOwner(ownerEntity);
    }

    @PutMapping(value = "/update",produces = MediaType.APPLICATION_JSON_VALUE)
    public OwnerEntity update(@RequestBody OwnerEntity ownerEntity) {
        return ownerService.updateOwner(ownerEntity);
    }

}
