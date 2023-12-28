package com.vehicle.assignment.Service;

import com.vehicle.assignment.Entities.Vehicle;
import com.vehicle.assignment.Repository.VehicleRepository;
import com.vehicle.assignment.Request.VehicleRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VehiclesServicesImpl implements VehicleServices{
    @Autowired
    private VehicleRepository vehicleRepository;
    @Override
    public List<Vehicle> findAllVehicle() {
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle findByID(long id) {
        return vehicleRepository.findById(id).get();
    }

    @Override
    public Vehicle addVehicle(VehicleRequest vehicleRequest) {
        Vehicle vehicle=new Vehicle();
        vehicle.setModel(vehicleRequest.getModel());
        vehicle.setStyle(vehicleRequest.getStyle());
        vehicle.setRegistrationNumber(vehicleRequest.getRegistrationNumber());
        return vehicleRepository.save(vehicle);
    }

    @Override
    public void deleteVehicleByID(long id) {
        vehicleRepository.deleteById(id);
    }

    @Override
    public Vehicle updateVehicle(VehicleRequest vehicleRequest) {

      Long  vehicleId=vehicleRequest.getId();
      Vehicle existingVehicle=vehicleRepository.findById(vehicleId).get();
        existingVehicle.setModel(vehicleRequest.getModel());
        existingVehicle.setStyle(vehicleRequest.getStyle());
        existingVehicle.setRegistrationNumber(vehicleRequest.getRegistrationNumber());
        return vehicleRepository.save(existingVehicle);
    }

    @Override
    public List<Vehicle> getVehiclesByFleet(long fleetId) {
        return vehicleRepository.findByFleetId(fleetId);
    }
}
