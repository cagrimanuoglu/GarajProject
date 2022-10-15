package com.example.GarageApi.requestClasses;

import com.example.GarageApi.entity.Vehicle;

public class LeaveRequestModel {

    private String ticket;

    private Vehicle vehicle;

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
