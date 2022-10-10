package com.example.warehouse.repository;

import com.example.warehouse.domain.InputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InputProductRepository extends JpaRepository<InputProduct, Long> {
}