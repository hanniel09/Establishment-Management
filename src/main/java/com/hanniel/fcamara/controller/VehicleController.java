package com.hanniel.fcamara.controller;

import com.hanniel.fcamara.model.Vehicle;
import com.hanniel.fcamara.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/vehicle")
public class VehicleController {
    @Autowired
    VehicleService vehicleService;

    @GetMapping
    public ResponseEntity<List<Vehicle>> getVehicle(){
       return ResponseEntity.ok(vehicleService.getVehicle());
    }
}
