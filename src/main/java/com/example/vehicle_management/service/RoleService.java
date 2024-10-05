package com.example.vehicle_management.service;

import com.example.vehicle_management.model.Role;
import com.example.vehicle_management.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    public Role save(Role role) {
        return roleRepository.save(role);
    }

    public void deleteById(String userId) {
        roleRepository.deleteById(userId);
    }

    public Role findById(String userId) {
        return roleRepository.findById(userId).orElse(null);
    }
}