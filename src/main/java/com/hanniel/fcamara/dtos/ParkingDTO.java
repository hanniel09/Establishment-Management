package com.hanniel.fcamara.dtos;

import com.hanniel.fcamara.model.Establishment;
import com.hanniel.fcamara.model.Parking;
import com.hanniel.fcamara.model.Vehicle;

public record ParkingDTO(
        long id, Establishment establishment, Vehicle vehicle
) {
    public ParkingDTO(Parking parking){
        this(parking.getId(),parking.getEstablishment(), parking.getVehicle());
    }
}
