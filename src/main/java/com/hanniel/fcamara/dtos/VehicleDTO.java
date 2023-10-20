package com.hanniel.fcamara.dtos;

import com.hanniel.fcamara.model.Vehicle;

public record VehicleDTO(
        long id, String brand, String model, String color, String plate, String type
) {
    public VehicleDTO(Vehicle vehicle){
        this(vehicle.getId(), vehicle.getBrand(), vehicle.getModel(), vehicle.getColor(), vehicle.getPlate(), vehicle.getType());
    }
}
