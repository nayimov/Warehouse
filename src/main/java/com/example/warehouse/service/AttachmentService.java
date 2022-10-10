package com.example.warehouse.service;

import com.example.warehouse.domain.Attachment;
import com.example.warehouse.repository.AttachmentRepository;
import org.aspectj.apache.bcel.classfile.NestHost;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
@Service
public class AttachmentService {

    private AttachmentRepository attachmentRepository;

    public AttachmentService(AttachmentRepository attachmentRepository) {
        this.attachmentRepository = attachmentRepository;
    }
    public void save(Attachment attachment) {
        attachmentRepository.save(attachment);
    }

    public List<Attachment> getAll() {
        return attachmentRepository.findAll();
    }

    public void edit(Attachment attachment) {
        attachmentRepository.save(attachment);
    }

    public void delete(Long id) {
        attachmentRepository.deleteById(id);
    }

    public Attachment getById(Long id) {
        return attachmentRepository.findById(id).orElseThrow(()->new EntityNotFoundException("entity with this id "+id+ " not found"));
    }
}
