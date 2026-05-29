package com.payflow.payflowapi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class TranferRequest {

    @NotBlank(message = "Username required")
    private String recieverUsername;

    @Positive(message = "Invalid Amount")
    private BigDecimal amount;
}
