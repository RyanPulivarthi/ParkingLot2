package com.scaler.parkinglot2.Services;

import com.scaler.parkinglot2.DTOs.GenerateTicketRequestDTO;
import com.scaler.parkinglot2.DTOs.GenerateTicketResponseDTO;
import com.scaler.parkinglot2.Models.*;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TicketService {
    public GenerateTicketResponseDTO generateTicket(GenerateTicketRequestDTO generateTicketRequestDTO) {
        Ticket ticket=new Ticket();
        Operator operator=new Operator();
        operator.setId(1409L);
        operator.setName("Ryan");
        ticket.setEntryTime(new Date());
        ticket.setOperator(operator);
        Vehicle vehicle=new Vehicle();
        vehicle.setVehicleType(generateTicketRequestDTO.getVehicleType());
        vehicle.setNumber(generateTicketRequestDTO.getVehicleNumber());
        ticket.setVehicle(vehicle);
        GenerateTicketResponseDTO generateTicketResponseDTO=new GenerateTicketResponseDTO();
        generateTicketResponseDTO.setTicket(ticket);
        generateTicketResponseDTO.setGenerateTicketResponseStatus(GenerateTicketResponseStatus.SUCCESS);
        return generateTicketResponseDTO;
    }
}
