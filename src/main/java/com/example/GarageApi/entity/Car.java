package com.example.GarageApi.entity;

public class Car extends Vehicle{
    public Car(String color, String licence) {
        super(color, licence);
        this.setType("Car");
        this.setCoverSlot(1);
    }
}
