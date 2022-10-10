package com.example.warehouse.repository;

import com.example.warehouse.domain.AttachmentContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, Long> {
}