package com.hanniel.fcamara.controller;

import com.hanniel.fcamara.model.Parking;
import com.hanniel.fcamara.service.ParkingService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping("api/parking")
public class ParkingController {
    @Autowired
    ParkingService parkingService;

    @GetMapping()
    public ResponseEntity<List<Parking>> getParking(){
        return ResponseEntity.ok(parkingService.getParking());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Parking> findParkingById(@PathVariable long id){
        return ResponseEntity.ok(parkingService.findById(id));
    }
}
