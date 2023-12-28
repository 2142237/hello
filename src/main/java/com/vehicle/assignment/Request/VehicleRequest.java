package com.vehicle.assignment.Request;

import jakarta.persistence.Id;

public class VehicleRequest {

    @Id
    private long id;

    private String registrationNumber;
    private String model;
    private long fleetId;

    private String style;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }



    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }


}
