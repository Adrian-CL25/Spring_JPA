package com.vehicleservice.demo.controller;

import com.vehicleservice.demo.model.Repair;
import com.vehicleservice.demo.model.Replacement;
import com.vehicleservice.demo.repository.ReplacementRepository;
import com.vehicleservice.demo.service.RepairService;
import com.vehicleservice.demo.service.ReplacemetnService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ReplacementController {
    private final ReplacemetnService replacemetnService;

    @PostMapping(value = "/replacement/create", consumes = "application/json", produces = MediaType.APPLICATION_JSON_VALUE)
    public Replacement createRepl(@RequestBody @Valid Replacement replacement) {

        return replacemetnService.createReplacement(replacement);
    }


    @GetMapping(value = "/replacement", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Replacement> getRepl() {
        return replacemetnService.getReplacementRepository().findAll();
    }
}
