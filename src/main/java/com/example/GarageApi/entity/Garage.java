package com.example.GarageApi.entity;

import java.util.*;

public class Garage {

    private static final int NUMBER_OF_SLOTS = 10;
    private int availableSlots = 10;
    private final List<Slot> parkingSlots;

    public Garage() {
        parkingSlots = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_SLOTS; i++) {
            parkingSlots.add(new Slot(i + 1));
        }
    }
    public boolean garageIsAvailable(Vehicle vehicle) {
        return vehicle.getCoverSlot() < availableSlots;
    }

    public boolean parkTheVehicle(Vehicle vehicle) throws Exception {
        int slotNumber = getAvailableParkingSlotNumber(vehicle);
        parkInParkSlot(vehicle, slotNumber);
        return true;
    }

    private int getAvailableParkingSlotNumber(Vehicle vehicle) throws Exception {
        for (int i = 0; i < parkingSlots.size(); i++) {
            if (i + vehicle.getCoverSlot() <= parkingSlots.size() && parkingSlots.get(i).isAvaible() && isEmptyBeforeParkingSlotOrFirstSlot(i)) {
                for (int j = 0; j < vehicle.getCoverSlot(); j++) {
                    if (!parkingSlots.get(i + j).isAvaible()) {
                        break;
                    }
                    if (isTheLastParkingSlotVehicleOccupies(vehicle, j) && isEmptyAfterParkingSlotOrLastSlot(i, j)) {
                        return i + 1;
                    }
                }
            }
        }
        throw new Exception("Garage is full!");
    }
    private boolean isTheLastParkingSlotVehicleOccupies(Vehicle vehicle, int j) {
        return j + 1 == vehicle.getCoverSlot();
    }
    private boolean isEmptyAfterParkingSlotOrLastSlot(int i, int j) {
        return i + j == parkingSlots.size() - 1 || parkingSlots.get(i + j + 1).isAvaible();
    }
    private boolean isEmptyBeforeParkingSlotOrFirstSlot(int i) {
        return i == 0 || parkingSlots.get(i - 1).isAvaible();
    }

    private void parkInParkSlot(Vehicle vehicle, int slotNumber) {
        for (int i = 0; i < vehicle.getCoverSlot(); i++) {
            parkingSlots.get((slotNumber - 1) + i).park(vehicle);
        }
        availableSlots -= vehicle.getCoverSlot();
    }
    public List<Vehicle> getVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        parkingSlots.forEach(parkingSlot -> {
            if (!parkingSlot.isAvaible()) {
                vehicles.add(parkingSlot.getVehicle());
            }
        });
        return vehicles;
    }

    public void leaveTheVehicle(Ticket ticket){
        availableSlots += ticket.getVehicle().getCoverSlot();
    }
}
