package com.example.warehouse.service;

import com.example.warehouse.domain.Output;
import com.example.warehouse.repository.OutputRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OutputService {
    private OutputRepository outputRepository;

    public OutputService(OutputRepository outputRepository) {
        this.outputRepository = outputRepository;
    }

    public void save(Output output) {
        outputRepository.save(output);
    }

    public Output getById(Long id) {
        return outputRepository.getById(id);
    }

    public List<Output> getAll() {
        return outputRepository.findAll();
    }

    public void edit(Output output) {
        outputRepository.save(output);
    }

    public void delete(Long id) {
        outputRepository.deleteById(id);
    }
}
