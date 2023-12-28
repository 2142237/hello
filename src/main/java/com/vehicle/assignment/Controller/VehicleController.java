package com.vehicle.assignment.Controller;

import com.vehicle.assignment.Entities.Driver;
import com.vehicle.assignment.Entities.Vehicle;
import com.vehicle.assignment.Repository.VehicleRepository;
import com.vehicle.assignment.Request.DriverRequest;
import com.vehicle.assignment.Request.VehicleRequest;
import com.vehicle.assignment.Service.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {
    @Autowired
    private VehicleServices vehicleServices;
    @PostMapping("/")
    public Vehicle addVehicle(@RequestBody VehicleRequest vehicleRequest){
        Vehicle add=vehicleServices.addVehicle(vehicleRequest);
        return add;
    }
    @GetMapping("/{id}")
    public Vehicle vehicleById(@PathVariable("id") long id){
        Vehicle ById=vehicleServices.findByID(id);
        return ById;

    }
    @GetMapping("/")
    public List<Vehicle> allVehicles(){
        List<Vehicle> Vehicles=vehicleServices.findAllVehicle();
        return Vehicles;
    }
    @DeleteMapping("/{id}")
    public void deleteVehicle(@PathVariable("id") long id){
        vehicleServices.deleteVehicleByID(id);
    }
    @PutMapping("/")
    public Vehicle update(@RequestBody VehicleRequest vehicleRequest){
        return vehicleServices.updateVehicle(vehicleRequest);
    }
    @GetMapping("/fleet/{fleetId}")
    public List<Vehicle> getVehiclesByFleet(@PathVariable("fleetId") long fleetId){
        return vehicleServices.getVehiclesByFleet(fleetId);
    }



}
