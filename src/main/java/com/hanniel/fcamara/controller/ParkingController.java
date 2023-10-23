package com.hanniel.fcamara.controller;

import com.hanniel.fcamara.dtos.ParkingDTO;
import com.hanniel.fcamara.dtos.ParkingRequest;
import com.hanniel.fcamara.model.Parking;
import com.hanniel.fcamara.service.ParkingService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;
import java.util.List;

@RestController
@RequestMapping("api/parking")
public class ParkingController {
    @Autowired
    ParkingService parkingService;

    @GetMapping()
    public ResponseEntity<List<Parking>> getParking() {
        return ResponseEntity.ok(parkingService.getParking());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Parking> findParkingById(@PathVariable long id) {
        return ResponseEntity.ok(parkingService.findById(id));
    }

    @PostMapping()
    public ResponseEntity<Parking> createParking(@RequestBody ParkingRequest request) {
        return new ResponseEntity<>(parkingService.createParking(request), HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Parking> updateParking(@RequestBody ParkingRequest request, @PathVariable long id){
        return new ResponseEntity<>(parkingService.updateParking(request, id), HttpStatus.NO_CONTENT);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteParking(@PathVariable long id){
        parkingService.deleteParking(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
