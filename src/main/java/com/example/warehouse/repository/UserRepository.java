package com.example.warehouse.repository;

import com.example.warehouse.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByFirstName(String firstname);
}
