package com.scaler.parkinglot2.Models;

import lombok.Data;

import java.util.List;

@Data
public class ParkingLot extends BaseModel{
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private ParkingLotStatus parkingLotStatus;
    private String name;
    private String address;


}
