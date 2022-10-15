package com.example.GarageApi.controller;

import com.example.GarageApi.commonUtil.Util;
import com.example.GarageApi.entity.Ticket;
import com.example.GarageApi.entity.Vehicle;
import com.example.GarageApi.requestClasses.LeaveRequestModel;
import com.example.GarageApi.requestClasses.ParkRequestModel;
import com.example.GarageApi.service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class Controller {

    @Autowired
    private GarageService garageService;

    @PostMapping("/park")
    public ResponseEntity<Ticket> parkTheVehicle(@RequestBody ParkRequestModel parkRequestModel) throws Exception {
        Vehicle vehicle = Util.createVehicle(parkRequestModel);
        return ResponseEntity.ok(garageService.park(vehicle));
    }

    @GetMapping("/status")
    public ResponseEntity<List<Vehicle>> garageStatus() {
        return ResponseEntity.ok(garageService.getStatus());
    }

    @PostMapping("/leave")
    public ResponseEntity<Boolean> leave(@RequestBody LeaveRequestModel leaveRequestModel) {
        return ResponseEntity.ok(garageService.leave(leaveRequestModel.getVehicle()));
    }

}
