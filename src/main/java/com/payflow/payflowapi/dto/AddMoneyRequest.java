package com.payflow.payflowapi.dto;

import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class AddMoneyRequest {

    @Positive(message = "Amount should be Positive")
    private BigDecimal amount;
}
