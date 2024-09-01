package com.scaler.parkinglot2.DTOs;

import lombok.Data;
import com.scaler.parkinglot2.Models.GenerateTicketResponseStatus;
import com.scaler.parkinglot2.Models.Ticket;
@Data
public class GenerateTicketResponseDTO {
    private Ticket ticket;
    private GenerateTicketResponseStatus generateTicketResponseStatus;
}
