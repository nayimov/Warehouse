package com.example.warehouse.service;

import com.example.warehouse.domain.OutputProduct;
import com.example.warehouse.repository.OutputProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OutputProductService {
    private OutputProductRepository outputProductRepository;

    public OutputProductService(OutputProductRepository outputProductRepository) {
        this.outputProductRepository = outputProductRepository;
    }

    public void save(OutputProduct outputProduct) {
        outputProductRepository.save(outputProduct);
    }

    public OutputProduct getById(Long id) {
        return outputProductRepository.getById(id);
    }

    public List<OutputProduct> getAll() {
        return outputProductRepository.findAll();
    }

    public void edit(OutputProduct outputProduct) {
        outputProductRepository.save(outputProduct);
    }

    public void delete(Long id) {
        outputProductRepository.deleteById(id);
    }
}
