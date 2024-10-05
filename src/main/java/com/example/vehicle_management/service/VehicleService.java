package com.example.vehicle_management.service;

import com.example.vehicle_management.model.Vehicle;
import com.example.vehicle_management.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }

    public Vehicle save(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public void deleteById(int id) {
        vehicleRepository.deleteById(id);
    }

    public Vehicle findById(int id) {
        return vehicleRepository.findById(id);
    }
}