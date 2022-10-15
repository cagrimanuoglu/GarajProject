package com.example.GarageApi.entity;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

    private String color;
    private String licence;
    private Ticket ticket;
    private int coverSlot;
    private String type;

    private List<Slot> slots = new ArrayList<>();


    public Vehicle(String color, String licence) {
        this.color = color;
        this.licence = licence;
    }
    public void parkInSlot(Slot s) {
        slots.add(s);
    }

    public String getColor() {
        return color;
    }

    public String getLicence() {
        return licence;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public int getCoverSlot() {
        return coverSlot;
    }

    public String getType() {
        return type;
    }

    public List<Slot> getSlots() {
        return slots;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCoverSlot(int coverSlot) {
        this.coverSlot = coverSlot;
    }
    /*    public List<Integer> getSlotNumber() {
        List<Integer> numbers = new ArrayList<>();
        slots.forEach(parkingSlot -> numbers.add(parkingSlot.getNumber()));
        return numbers;
    }

    public void leaveTheParkingSlot() {
        parkingSlots.forEach(ParkingSlot::leaveVehicle);
        parkingSlots.clear();
    } */
}
