package com.example.vehicle_management.controller;

import com.example.vehicle_management.model.Vehicle;
import com.example.vehicle_management.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/vehicles")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @GetMapping
    public String listVehicles(Model model) {
        List<Vehicle> vehicles = vehicleService.findAll();
        model.addAttribute("vehicles", vehicles);
        return "catalogue"; // Trỏ đến template catalogue.html
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("vehicle", new Vehicle());
        return "add_vehicle"; // Trỏ đến template add_vehicle.html
    }

    @PostMapping("/add")
    public String addVehicle(@ModelAttribute Vehicle vehicle) {
        vehicleService.save(vehicle);
        return "redirect:/vehicles";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model) {
        Vehicle vehicle = vehicleService.findById(id);
        model.addAttribute("vehicle", vehicle);
        return "edit_vehicle"; // Trỏ đến template edit_vehicle.html
    }

    @PostMapping("/edit/{id}")
    public String updateVehicle(@ModelAttribute Vehicle vehicle) {
        vehicleService.save(vehicle);
        return "redirect:/vehicles";
    }

    @PostMapping("/delete/{id}")
    public String deleteVehicle(@PathVariable int id) {
        vehicleService.deleteById(id);
        return "redirect:/vehicles";
    }
}