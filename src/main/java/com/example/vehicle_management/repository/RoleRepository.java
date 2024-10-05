package com.example.vehicle_management.repository;

import com.example.vehicle_management.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String> {
}