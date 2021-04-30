package com.vehicleservice.demo.repository;

import com.vehicleservice.demo.model.CarEntity;
import com.vehicleservice.demo.model.InvoiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends JpaRepository<InvoiceEntity,Integer> {
}
