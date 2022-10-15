package com.example.GarageApi.service;

import com.example.GarageApi.entity.Ticket;
import com.example.GarageApi.entity.Vehicle;

import java.util.List;

public interface GarageService {

    Ticket park(Vehicle vehicle) throws Exception;
    List<Vehicle> getStatus();
    boolean leave(Vehicle vehicle);
}
