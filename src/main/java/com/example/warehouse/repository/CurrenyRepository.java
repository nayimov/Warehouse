package com.example.warehouse.repository;

import com.example.warehouse.domain.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrenyRepository extends JpaRepository<Currency, Long> {


}
