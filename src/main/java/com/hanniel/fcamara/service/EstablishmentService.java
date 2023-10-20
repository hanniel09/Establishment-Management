package com.hanniel.fcamara.service;

import com.hanniel.fcamara.model.Establishment;
import com.hanniel.fcamara.repository.EstablishmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstablishmentService {

    @Autowired
    EstablishmentRepository establishmentRepository;

    public List<Establishment> getEstablishment(){
        return establishmentRepository.findAll();
    }

}
