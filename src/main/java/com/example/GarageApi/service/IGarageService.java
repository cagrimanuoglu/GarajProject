package com.example.GarageApi.service;

import com.example.GarageApi.entity.Garage;
import com.example.GarageApi.entity.Ticket;
import com.example.GarageApi.entity.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


public class IGarageService implements GarageService {

    @Autowired
    private Garage garage;

    @Override
    public Ticket park(Vehicle vehicle) throws Exception {

        if (garage.garageIsAvailable(vehicle)) {
            garage.parkTheVehicle(vehicle);
        }

        return vehicle.getTicket();
    }

    @Override
    public List<Vehicle> getStatus() {
        return garage.getVehicles();
    }

    @Override
    public boolean leave(Vehicle vehicle) {
        garage.leaveTheVehicle(vehicle.getTicket());
        return true;
    }
}
