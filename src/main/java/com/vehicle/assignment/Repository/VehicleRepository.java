package com.vehicle.assignment.Repository;

import com.vehicle.assignment.Entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Long> {
       List<Vehicle> findByFleetId(long fleeetId);
}
