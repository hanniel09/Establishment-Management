package com.hanniel.fcamara.controller;

import com.hanniel.fcamara.dtos.VehicleDTO;
import com.hanniel.fcamara.model.Vehicle;
import com.hanniel.fcamara.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(path = "/{id}")
    public ResponseEntity<Vehicle> findVehicleById(@PathVariable long id){
        return ResponseEntity.ok(vehicleService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Vehicle> createVehicle(@RequestBody VehicleDTO vehicleDTO){
       return new ResponseEntity<>(vehicleService.createVehicle(vehicleDTO), HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Vehicle> updateVehicle(@RequestBody VehicleDTO vehicleDTO, @PathVariable long id){
        return new ResponseEntity<>(vehicleService.updateVehicle(vehicleDTO, id), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteVehicle(@PathVariable long id){
        vehicleService.deleteVehicle(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
