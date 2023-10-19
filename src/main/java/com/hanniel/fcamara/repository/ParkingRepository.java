package com.hanniel.fcamara.repository;

import com.hanniel.fcamara.model.Parking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingRepository extends JpaRepository<Parking, Long> {
}
