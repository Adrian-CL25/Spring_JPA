package com.vehicleservice.demo.repository;

import com.vehicleservice.demo.model.CarEntity;
import com.vehicleservice.demo.model.InvoiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.NamedQuery;
import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<InvoiceEntity,Integer> {


}
