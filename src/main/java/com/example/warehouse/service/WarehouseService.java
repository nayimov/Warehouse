package com.example.warehouse.service;

import com.example.warehouse.domain.Warehouse;
import com.example.warehouse.repository.WarehouseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarehouseService {
    private WarehouseRepository warehouseRepository;

    public WarehouseService(WarehouseRepository warehouseRepository) {
        this.warehouseRepository = warehouseRepository;
    }

    public void save(Warehouse warehouse) {
        warehouseRepository.save(warehouse);
    }

    public List<Warehouse> getAll() {
        return warehouseRepository.findAll();
    }

    public void edit(Warehouse warehouse) {
        warehouseRepository.save(warehouse);
    }

    public void delete(Long id) {
        warehouseRepository.deleteById(id);
    }

    public Warehouse getById(Long id) {
        return warehouseRepository.getById(id);
    }
}