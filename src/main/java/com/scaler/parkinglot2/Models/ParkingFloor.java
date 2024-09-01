package com.scaler.parkinglot2.Models;

import lombok.Data;

import java.util.List;
@Data
public class ParkingFloor extends BaseModel{
    private int floorNumber;
    private List<ParkingSpot> parkingSpots;
}
