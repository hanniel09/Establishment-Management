package com.hanniel.fcamara.service;

import com.hanniel.fcamara.model.Vehicle;
import com.hanniel.fcamara.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
    @Autowired
    VehicleRepository vehicleRepository;

    public List<Vehicle> getVehicle(){
        return vehicleRepository.findAll();
    }
}
