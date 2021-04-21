package com.vehicleservice.demo.repository;

import com.vehicleservice.demo.domain.entity.Repair;
import com.vehicleservice.demo.domain.entity.Replacement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReplacementRepository extends JpaRepository<Replacement,Integer> {
}
