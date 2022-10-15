package com.example.GarageApi.entity;

import com.example.GarageApi.commonUtil.Util;

import java.time.LocalDateTime;

public class Ticket {

    private Vehicle vehicle;
    private String ticketNo;
    private long amount;
    private LocalDateTime started;
    private LocalDateTime finished;

    public Ticket(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.started = LocalDateTime.now();
        this.ticketNo = createTicketNo(vehicle.getLicence());
    }

    private String createTicketNo(String licence) {
        int MIN = 0;
        int MAX = 9999;
        String random = Integer.toString(Util.getRandomNumber(MIN, MAX));
        return licence + random;
    }

    public String getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(String ticketNo) {
        this.ticketNo = ticketNo;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public LocalDateTime getStarted() {
        return started;
    }

    public void setStarted(LocalDateTime started) {
        this.started = started;
    }

    public LocalDateTime getFinished() {
        return finished;
    }

    public void setFinished(LocalDateTime finished) {
        this.finished = finished;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
