package com.scaler.parkinglot2.Models;

import lombok.Data;

@Data
public class ElectricParkingSpot extends ParkingSpot{
    private ElectricMeter electricMeter;
}
