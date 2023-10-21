package com.hanniel.fcamara.model;

import com.hanniel.fcamara.dtos.EstablishmentDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "establishment")
public class Establishment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Column(name = "name")
    private String name;

    @NotBlank
    @Column(name = "CNPJ")
    private String CNPJ;

    @NotBlank
    @Column(name = "address")
    private String address;

    @NotBlank
    @Column(name = "phone")
    private String phone;

    @NotBlank
    @Column(name = "motorcycle_spaces")
    private int motorcycleSpaces;

    @NotBlank
    @Column(name = "car_spaces")
    private int carSpaces;

    public Establishment(String name, String CNPJ, String address, String phone, int motorcycleSpaces, int carSpaces) {
        this.name = name;
        this.CNPJ = CNPJ;
        this.address = address;
        this.phone = phone;
        this.motorcycleSpaces = motorcycleSpaces;
        this.carSpaces = carSpaces;
    }

    public Establishment(EstablishmentDTO data) {
        this.name = data.name();
        this.CNPJ = data.CNPJ();
        this.address = data.address();
        this.phone = data.phone();
        this.motorcycleSpaces = data.motorcycleSpaces();
        this.carSpaces = data.carSpaces();
    }

    public Establishment() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getMotorcycleSpaces() {
        return motorcycleSpaces;
    }

    public void setMotorcycleSpaces(int motorcycleSpaces) {
        this.motorcycleSpaces = motorcycleSpaces;
    }

    public int getCarSpaces() {
        return carSpaces;
    }

    public void setCarSpaces(int carSpaces) {
        this.carSpaces = carSpaces;
    }
}
