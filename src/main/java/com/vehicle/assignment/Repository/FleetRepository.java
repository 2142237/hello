package com.vehicle.assignment.Repository;

import com.vehicle.assignment.Entities.Fleet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FleetRepository extends JpaRepository<Fleet,Long> {

}
