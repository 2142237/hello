package com.vehicle.assignment.Service;

import com.vehicle.assignment.Entities.Fleet;

import java.util.List;

public interface FleetServices {
     public Fleet addFleet(Fleet fleet);
    public List<Fleet> getAllFleets();
    public void deleteFleetById(long id);
    public Fleet getFleetByID(long id);
}
