package com.example.GarageApi.entity;

public class Slot {

    private int number;
    private boolean isAvaible;
    private Vehicle vehicle;

    public Slot(int number) {
        this.number = number;
        this.isAvaible = true;
    }

    public int getNumber() {
        return number;
    }

    public boolean isAvaible() {
        return isAvaible;
    }
    public void park(Vehicle vehicle) {
        this.isAvaible = false;
        this.vehicle = vehicle;
        vehicle.parkInSlot(this);
    }


    public Vehicle getVehicle() {
        return vehicle;
    }
}
