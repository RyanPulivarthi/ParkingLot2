package com.scaler.parkinglot2.DTOs;

import lombok.Data;
import com.scaler.parkinglot2.Models.VehicleType;
@Data
public class GenerateTicketRequestDTO {
    private String vehicleNumber;
    private VehicleType vehicleType;
    private Long gateId;
}
