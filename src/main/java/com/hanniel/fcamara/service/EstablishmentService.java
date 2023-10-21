package com.hanniel.fcamara.service;

import com.hanniel.fcamara.dtos.EstablishmentDTO;
import com.hanniel.fcamara.exception.BadRequestException;
import com.hanniel.fcamara.model.Establishment;
import com.hanniel.fcamara.repository.EstablishmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EstablishmentService {

    @Autowired
    EstablishmentRepository establishmentRepository;

    public List<Establishment> getEstablishment(){
        return establishmentRepository.findAll();
    }

    public Establishment findEstablishmentById(long id){
        return establishmentRepository.findById(id).orElseThrow(() ->
                new BadRequestException("Establishment ID not found"));
    }

    @Transactional
    public Establishment createEstablishment(EstablishmentDTO data){
        Establishment establishment = new Establishment(data);
        return establishmentRepository.save(establishment);
    }
}
