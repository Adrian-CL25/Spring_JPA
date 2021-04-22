package com.vehicleservice.demo.repository;

import com.vehicleservice.demo.model.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarEntity,Integer> {
}
