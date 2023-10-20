package com.hanniel.fcamara.service;

import com.hanniel.fcamara.dtos.VehicleDTO;
import com.hanniel.fcamara.exception.BadRequestException;
import com.hanniel.fcamara.model.Vehicle;
import com.hanniel.fcamara.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {
    @Autowired
    VehicleRepository vehicleRepository;

    public List<Vehicle> getVehicle(){
        return vehicleRepository.findAll();
    }

    public Vehicle findById(long id){
        return vehicleRepository.findById(id).orElseThrow(() ->
                new BadRequestException("Vehicle ID not found"));
    }

    @Transactional
    public Vehicle createVehicle(VehicleDTO data){
        Vehicle vehicle = new Vehicle(data);
        return vehicleRepository.save(vehicle);
    }

    public Vehicle updateVehicle(VehicleDTO data, long id){
        Vehicle savedVehicle = findById(id);
        Vehicle vehicle = new Vehicle(data);
        vehicle.setId(savedVehicle.getId());
        return vehicleRepository.save(vehicle);
    }

    public void deleteVehicle(long id){
        Vehicle vehicle = findById(id);
        vehicleRepository.delete(vehicle);
    }
}
