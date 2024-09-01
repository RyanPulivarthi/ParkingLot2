package com.scaler.parkinglot2.Models;

import lombok.Data;

@Data
public class Gate extends BaseModel{
    private GateType gateType;
    private Operator operator;
}
