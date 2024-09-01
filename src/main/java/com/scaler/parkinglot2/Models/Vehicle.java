package com.scaler.parkinglot2.Models;

import lombok.Data;

@Data
public class Vehicle extends BaseModel{
    private VehicleType vehicleType;
    private String number;
}
