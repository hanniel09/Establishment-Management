package com.hanniel.fcamara.repository;

import com.hanniel.fcamara.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
