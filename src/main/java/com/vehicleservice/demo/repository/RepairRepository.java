package com.vehicleservice.demo.repository;

import com.vehicleservice.demo.model.CarEntity;
import com.vehicleservice.demo.model.Repair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepairRepository extends JpaRepository<Repair,Integer> {
}
