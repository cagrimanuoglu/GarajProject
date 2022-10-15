package com.example.GarageApi.entity;

public class Jeep extends Vehicle {
    public Jeep(String color, String licence) {
        super(color, licence);
        this.setType("Jeep");
        this.setCoverSlot(2);
    }
}
