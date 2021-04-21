package com.vehicleservice.demo.repository;

import com.vehicleservice.demo.domain.entity.CarEntity;
import com.vehicleservice.demo.domain.entity.Repair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepairRepository extends JpaRepository<Repair,Integer> {
}
