package com.scaler.parkinglot2.Models;

import lombok.Data;

import java.util.List;
@Data
public class ParkingSpot extends BaseModel{
    private ParkingSpotStatus parkingSpotStatus;
    private List<VehicleType> vehicleTypes;
    private int floorNumber;

}
