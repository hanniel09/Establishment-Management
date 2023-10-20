package com.hanniel.fcamara.service;

import com.hanniel.fcamara.exception.BadRequestException;
import com.hanniel.fcamara.model.Parking;
import com.hanniel.fcamara.repository.ParkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingService {
    @Autowired
    ParkingRepository parkingRepository;

    public List<Parking> getParking(){
        return parkingRepository.findAll();
    }

    public Parking findById(Long id){
       return parkingRepository.findById(id).orElseThrow(() ->
               new BadRequestException("Parking ID not found"));
    }

}
