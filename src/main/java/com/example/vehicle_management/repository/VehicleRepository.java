package com.example.vehicle_management.repository;

import com.example.vehicle_management.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository



public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

    // Tìm kiếm tất cả xe

    List<Vehicle> findAll();

    // Tìm xe theo ID
    Vehicle findById(int id);

    // Tìm xe theo tên
    List<Vehicle> findByVehicleName(String vehicleName);

    // Tìm xe theo màu
    List<Vehicle> findByVehicleColor(String vehicleColor);

    // Xóa xe theo ID
    void deleteById(int id);
}