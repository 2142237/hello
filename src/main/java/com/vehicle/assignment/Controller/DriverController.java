package com.vehicle.assignment.Controller;

import com.vehicle.assignment.Entities.Driver;
import com.vehicle.assignment.Request.DriverRequest;
import com.vehicle.assignment.Service.DriverServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drivers")
public class DriverController {
    @Autowired
    private DriverServices driverServices;

    @PostMapping ("/")
    public Driver insertDriver(@RequestBody DriverRequest driverRequest){
        Driver add=driverServices.addDriver(driverRequest);
        return add;
    }

    @GetMapping("/{id}")
    public Driver findById(@PathVariable("id") long id){
        Driver driverById=driverServices.findDriverById(id);

        return driverById;
    }
    @GetMapping("/")
    public List<Driver> allDrivers(){
        List<Driver> Drivers=driverServices.findAllDrivers();
        return Drivers;
    }
    @DeleteMapping("/{id}")
    public void deleteDriver(@PathVariable("id") long id){
        driverServices.deleteDiverByID(id);
    }
     @PutMapping("/")
    public Driver update(@RequestBody DriverRequest driverRequest){
       return driverServices.updateDriver(driverRequest);
    }



}
