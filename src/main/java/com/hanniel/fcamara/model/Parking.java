package com.hanniel.fcamara.model;

import com.hanniel.fcamara.dtos.ParkingDTO;
import jakarta.persistence.*;

@Entity
@Table(name = "parking")
public class Parking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "id_establishment")
    private Establishment establishment;

    @ManyToOne
    @JoinColumn(name = "id_vehicle")
    private Vehicle vehicle;

    public Parking(Establishment establishment, Vehicle vehicle) {
        this.establishment = establishment;
        this.vehicle = vehicle;
    }

    public Parking(ParkingDTO data) {
        this.establishment = data.establishment();
        this.vehicle = data.vehicle();
    }

    public Parking() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Establishment getEstablishment() {
        return establishment;
    }

    public void setEstablishment(Establishment establishment) {
        this.establishment = establishment;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
