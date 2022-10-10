package com.example.warehouse.repository;

import com.example.warehouse.domain.OutputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutputProductRepository extends JpaRepository<OutputProduct, Long> {
}