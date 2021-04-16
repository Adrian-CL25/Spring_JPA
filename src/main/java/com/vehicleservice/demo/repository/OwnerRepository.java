package com.vehicleservice.demo.repository;

import com.vehicleservice.demo.model.OwnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OwnerRepository extends JpaRepository<OwnerEntity, Integer> {


}
