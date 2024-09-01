package com.scaler.parkinglot2.Models;

import lombok.Data;

import java.util.Date;
@Data
public class Ticket {
    private Gate gate;
    private Date entryTime;
    private Operator operator;
    private ParkingSpot parkingSpot;
    private Vehicle vehicle;
}
