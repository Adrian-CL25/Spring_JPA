package com.vehicleservice.demo.service;

import com.vehicleservice.demo.model.CarEntity;
import com.vehicleservice.demo.repository.CarRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
public class CarService {
    @Autowired
    private final CarRepository carRepository;

//    public CarEntity addNewCar(CarEntity newCar){
//        return carRepository.save(newCar);
//
//    }
}
