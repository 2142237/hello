package com.vehicle.assignment.Service;

import com.vehicle.assignment.Entities.Driver;
import com.vehicle.assignment.Repository.DriverRepository;
import com.vehicle.assignment.Request.DriverRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DriverServicesImpl implements DriverServices {
    @Autowired
    private DriverRepository driverRepository;
    @Override
    public Driver addDriver(DriverRequest driverRequest) {
        Driver driver= new Driver();
        driver.setName(driverRequest.getName());
        driver.setAddress(driverRequest.getAddress());
        driver.setLicense_number(driverRequest.getLicenseNumber());
        driver.setPhone_number(driverRequest.getPhone_number());

       return driverRepository.save(driver);
    }

    @Override
    public List<Driver> findAllDrivers() {

        return driverRepository.findAll();
    }

    @Override
    public Driver findDriverById(long id) {
        return driverRepository.findById(id).get();
    }

    @Override
    public void deleteDiverByID(long id) {
        driverRepository.deleteById(id);

    }

    @Override
    public Driver updateDriver(DriverRequest driverRequest) {
            Long driverId=driverRequest.getId();
            Driver existingDriver= driverRepository.findById(driverId).get();
            existingDriver.setName(driverRequest.getName());
            existingDriver.setAddress(driverRequest.getAddress());
            existingDriver.setPhone_number(driverRequest.getPhone_number());
            existingDriver.setLicense_number(driverRequest.getLicenseNumber());

            return driverRepository.save(existingDriver);


    }


}
