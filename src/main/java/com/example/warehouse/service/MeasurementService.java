package com.example.warehouse.service;

import com.example.warehouse.domain.Measurement;
import com.example.warehouse.repository.MeasurementRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MeasurementService {

    private MeasurementRepository measurementRepository;

    public MeasurementService(MeasurementRepository measurementRepository) {
        this.measurementRepository = measurementRepository;
    }

    public void save(Measurement measurement) {
        measurementRepository.save(measurement);
    }

    public Measurement getById(Long Id) {
        return measurementRepository.getById(Id);
    }

    public List<Measurement> getAll() {
        return measurementRepository.findAll();
    }

    public void edit(Measurement measurement) {
        measurementRepository.save(measurement);
    }

    public void delete(Long Id) {
        measurementRepository.deleteById(Id);
    }
}
