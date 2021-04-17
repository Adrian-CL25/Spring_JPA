package com.vehicleservice.demo.repository;

import com.vehicleservice.demo.domain.entity.OwnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OwnerRepository extends JpaRepository<OwnerEntity, Integer> {


}
