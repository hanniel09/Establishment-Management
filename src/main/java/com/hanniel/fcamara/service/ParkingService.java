package com.hanniel.fcamara.service;

import com.hanniel.fcamara.dtos.ParkingDTO;
import com.hanniel.fcamara.exception.BadRequestException;
import com.hanniel.fcamara.model.Parking;
import com.hanniel.fcamara.repository.ParkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional
    public Parking createParking(ParkingDTO data){
       Parking parking = new Parking(data);
       return parkingRepository.save(parking);
    }

    public Parking updateParking(ParkingDTO data, long id){
        Parking savedParking = findById(id);
        Parking parking = new Parking(data);
        parking.setId(savedParking.getId());
        return parkingRepository.save(parking);
    }

    public void deleteParking(long id){
        Parking parking = findById(id);
        parkingRepository.delete(parking);
    }
}
