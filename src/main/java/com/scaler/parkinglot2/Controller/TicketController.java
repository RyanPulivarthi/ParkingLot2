package com.scaler.parkinglot2.Controller;

import com.scaler.parkinglot2.DTOs.GenerateTicketRequestDTO;
import com.scaler.parkinglot2.DTOs.GenerateTicketResponseDTO;
import com.scaler.parkinglot2.Services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("GenerateTicket")
public class TicketController {
    @Autowired
    private TicketService ticketService;
    @PostMapping("/")
    public GenerateTicketResponseDTO getTicketService(@RequestBody GenerateTicketRequestDTO generateTicketRequestDTO) {
        return ticketService.generateTicket(generateTicketRequestDTO);

    }
}
