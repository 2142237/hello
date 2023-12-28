package com.vehicle.assignment.Service;

import com.vehicle.assignment.Entities.Driver;
import com.vehicle.assignment.Request.DriverRequest;

import java.util.List;

public interface DriverServices {
    public Driver addDriver(DriverRequest driverRequest);
    public List<Driver> findAllDrivers();
    public Driver findDriverById(long id);
    public void deleteDiverByID(long id);
    public Driver updateDriver(DriverRequest driverRequest);


}
