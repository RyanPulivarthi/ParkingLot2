package com.scaler.parkinglot2.Models;
import lombok.Data;

import java.util.Date;
@Data
public class Bill extends BaseModel{
    private BillStatus billStatus;
    private Ticket ticket;
    private Date exitTime;
    private int amount;
}
