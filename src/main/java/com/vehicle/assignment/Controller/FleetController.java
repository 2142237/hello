package com.vehicle.assignment.Controller;

import com.vehicle.assignment.Entities.Fleet;
import com.vehicle.assignment.Entities.Vehicle;
import com.vehicle.assignment.Service.FleetServices;
import com.vehicle.assignment.Service.FleetServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fleet")
public class FleetController {
    @Autowired
    private FleetServicesImpl fleetServicesImpl;
    @PostMapping("/")
    public Fleet addFleet(@RequestBody Fleet fleet){
       Fleet addFleet= fleetServicesImpl.addFleet(fleet);

        return addFleet;
    }
    @GetMapping("/")
    public List<Fleet> getFleet(){
        return fleetServicesImpl.getAllFleets();
    }
    @DeleteMapping("/{id}")
    public void deleteFleet(@PathVariable("id") long id){
        fleetServicesImpl.deleteFleetById(id);
    }

}
