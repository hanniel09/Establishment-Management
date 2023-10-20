package com.hanniel.fcamara.controller;

import com.hanniel.fcamara.model.Establishment;
import com.hanniel.fcamara.service.EstablishmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/establishment")
public class EstablishmentController {

    @Autowired
    EstablishmentService establishmentService;

    @GetMapping()
    public ResponseEntity<List<Establishment>> getEstablishment(){
        return ResponseEntity.ok(establishmentService.getEstablishment());
    }
}
