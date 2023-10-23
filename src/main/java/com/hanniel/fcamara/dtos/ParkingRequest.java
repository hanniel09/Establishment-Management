package com.hanniel.fcamara.dtos;

public class ParkingRequest {
    private long establishmentId;
    private long vehicleId;

    public long getEstablishmentId() {
        return establishmentId;
    }

    public void setEstablishmentId(long establishmentId) {
        this.establishmentId = establishmentId;
    }

    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }
}
