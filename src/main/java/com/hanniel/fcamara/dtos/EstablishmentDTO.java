package com.hanniel.fcamara.dtos;

import com.hanniel.fcamara.model.Establishment;

public record EstablishmentDTO(
        long id,
        String name,
        String CNPJ,
        String address,
        String phone,
        int motorcycleSpaces,
        int carSpaces
) {
    public EstablishmentDTO(Establishment establishment){
        this(establishment.getId(), establishment.getName(), establishment.getCNPJ(),
                establishment.getAddress(), establishment.getPhone(), establishment.getMotorcycleSpaces(),
                establishment.getCarSpaces());
    }
}
