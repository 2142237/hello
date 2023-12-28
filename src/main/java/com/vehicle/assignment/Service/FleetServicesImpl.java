package com.vehicle.assignment.Service;

import com.vehicle.assignment.Entities.Fleet;
import com.vehicle.assignment.Repository.FleetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FleetServicesImpl implements FleetServices{
    @Autowired
     private FleetRepository fleetRepository;
    @Override
    public Fleet addFleet(Fleet fleet) {
        return fleetRepository.save(fleet);
    }

    @Override
    public List<Fleet> getAllFleets() {
        return fleetRepository.findAll();
    }

    @Override
    public void deleteFleetById(long id) {
        fleetRepository.deleteById(id);

    }

    @Override
    public Fleet getFleetByID(long id) {
        return null;
    }
}
