package com.hanniel.fcamara.model;

import jakarta.persistence.*;

@Entity
@Table(name = "establishment")
public class Establishment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "CNPJ")
    private String CNPJ;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "motorcycleSpaces")
    private int motorcycleSpaces;

    @Column(name = "carSpaces")
    private int carSpaces;

    public Establishment(String name, String CNPJ, String address, String phone, int motorcycleSpaces, int carSpaces) {
        this.name = name;
        this.CNPJ = CNPJ;
        this.address = address;
        this.phone = phone;
        this.motorcycleSpaces = motorcycleSpaces;
        this.carSpaces = carSpaces;
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
