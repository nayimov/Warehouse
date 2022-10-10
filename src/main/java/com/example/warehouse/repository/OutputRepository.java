package com.example.warehouse.repository;

import com.example.warehouse.domain.Output;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OutputRepository extends JpaRepository<Output ,Long> {


}
