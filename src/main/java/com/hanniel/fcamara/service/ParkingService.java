package com.hanniel.fcamara.service;

import com.hanniel.fcamara.dtos.ParkingDTO;
import com.hanniel.fcamara.dtos.ParkingRequest;
import com.hanniel.fcamara.exception.BadRequestException;
import com.hanniel.fcamara.model.Establishment;
import com.hanniel.fcamara.model.Parking;
import com.hanniel.fcamara.model.Vehicle;
import com.hanniel.fcamara.repository.EstablishmentRepository;
import com.hanniel.fcamara.repository.ParkingRepository;
import com.hanniel.fcamara.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ParkingService {
    @Autowired
    ParkingRepository parkingRepository;

    @Autowired
    EstablishmentRepository establishmentRepository;

    @Autowired
    VehicleRepository vehicleRepository;

    public List<Parking> getParking(){
        return parkingRepository.findAll();
    }

    public Parking findById(Long id){
       return parkingRepository.findById(id).orElseThrow(() ->
               new BadRequestException("Parking ID not found"));
    }

    @Transactional
    public Parking createParking(ParkingRequest request){
        Establishment establishment = establishmentRepository.findById(request.getEstablishmentId()).orElseThrow(() ->
                new BadRequestException("Establishment ID not found"));

        Vehicle vehicle = vehicleRepository.findById(request.getVehicleId()).orElseThrow(() ->
                new BadRequestException("Vehicle ID not found"));

        Parking parking = new Parking(establishment, vehicle);
        return parkingRepository.save(parking);
    }

    public Parking updateParking(ParkingRequest request, long id){
        Establishment establishment = establishmentRepository.findById(request.getEstablishmentId())
                .orElseThrow(() -> new BadRequestException("Estabelecimento não encontrado"));

        Vehicle vehicle = vehicleRepository.findById(request.getVehicleId())
                .orElseThrow(() -> new BadRequestException("Veículo não encontrado"));

        Parking existingParking = findById(id);

        existingParking.setEstablishment(establishment);
        existingParking.setVehicle(vehicle);

        return parkingRepository.save(existingParking);
    }

    public void deleteParking(long id){
        Parking parking = findById(id);
        parkingRepository.delete(parking);
    }
}
