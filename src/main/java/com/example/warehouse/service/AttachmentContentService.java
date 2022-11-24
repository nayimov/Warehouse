package com.example.warehouse.service;

import com.example.warehouse.domain.AttachmentContent;
import com.example.warehouse.repository.AttachmentContentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachmentContentService {

    private AttachmentContentRepository attachmentContentRepository;

    public AttachmentContentService(AttachmentContentRepository attachmentContentRepository) {
        this.attachmentContentRepository = attachmentContentRepository;
    }

    public void save(AttachmentContent attachmentContent) {
        attachmentContentRepository.save(attachmentContent);
    }

    public AttachmentContent getById(Long Id) {
        return attachmentContentRepository.getById(Id);
    }

    public List<AttachmentContent> getAll() {
        return attachmentContentRepository.findAll();
    }

    public void edit(AttachmentContent attachmentContent) {
        attachmentContentRepository.save(attachmentContent);
    }

    public void delete(Long id) {
        attachmentContentRepository.deleteById(id);
    }
}
