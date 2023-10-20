package com.hanniel.fcamara.model;

import com.hanniel.fcamara.dtos.VehicleDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Column(name = "brand")
    private String brand;

    @NotBlank
    @Column(name = "model")
    private String model;

    @NotBlank
    @Column(name = "color")
    private String color;

    @NotBlank
    @Column(name = "plate")
    private String plate;

    @NotBlank
    @Column(name = "type")
    private String type;

    public Vehicle(String brand, String model, String color, String plate, String type) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.plate = plate;
        this.type = type;
    }

    public Vehicle(VehicleDTO data){
        this.brand = data.brand();
        this.model = data.model();
        this.color = data.color();
        this.plate = data.plate();
        this.type = data.type();
    }

    public Vehicle() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
