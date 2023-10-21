package com.hanniel.fcamara.controller;

import com.hanniel.fcamara.dtos.EstablishmentDTO;
import com.hanniel.fcamara.model.Establishment;
import com.hanniel.fcamara.service.EstablishmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/establishment")
public class EstablishmentController {

    @Autowired
    EstablishmentService establishmentService;

    @GetMapping()
    public ResponseEntity<List<Establishment>> getEstablishment() {
        return ResponseEntity.ok(establishmentService.getEstablishment());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Establishment> getEstablishmentById(@PathVariable long id) {
        return ResponseEntity.ok(establishmentService.findEstablishmentById(id));
    }

    @PostMapping()
    public ResponseEntity<Establishment> createEstablishment(@RequestBody EstablishmentDTO establishmentDTO) {
        return new ResponseEntity<>(establishmentService.createEstablishment(establishmentDTO), HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Establishment> updateEstablishment(@RequestBody EstablishmentDTO establishmentDTO,
                                                             @PathVariable long id) {
        return new ResponseEntity<>(establishmentService.
                updateEstablishment(establishmentDTO, id), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteEstablishment(@PathVariable long id){
        establishmentService.deleteEstablishment(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
