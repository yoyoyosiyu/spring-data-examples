package com.huayutech.springdatarest.repository;

import com.huayutech.data.model.northwind.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
