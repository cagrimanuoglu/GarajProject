package com.example.GarageApi.entity;

public class Truck extends Vehicle {
    public Truck(String color, String licence) {
        super(color, licence);
        this.setType("Truck");
        this.setCoverSlot(4);
    }
}
