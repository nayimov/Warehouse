package com.example.warehouse.controller;

import com.example.warehouse.domain.AttachmentContent;
import com.example.warehouse.service.AttachmentContentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/AttachmentContent")
class AttachmentContentController {
    private AttachmentContentService attachmentContentService;

    public AttachmentContentController(AttachmentContentService attachmentContentService) {
        this.attachmentContentService = attachmentContentService;
    }

    @GetMapping()
    public ResponseEntity<?> getAll() {
        return ResponseEntity.status(200).body(attachmentContentService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        return ResponseEntity.status(200).body(attachmentContentService.getById(id));
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody AttachmentContent attachmentContent) {
        attachmentContentService.save(attachmentContent);
        return ResponseEntity.status(200).body(null);
    }

    @DeleteMapping("/AttachmentContent/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id) {
        attachmentContentService.delete(id);
        return ResponseEntity.ok(id);
    }

    @PostMapping("/AttachmentContent/{id}")
    public ResponseEntity<?> edit(@PathVariable AttachmentContent attachmentContent) {
        attachmentContentService.edit(attachmentContent);
        return ResponseEntity.ok(attachmentContent);
    }
}