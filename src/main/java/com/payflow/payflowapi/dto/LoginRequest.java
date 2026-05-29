package com.payflow.payflowapi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginRequest
{
    @NotBlank(message = "Password is Requires")
    private String password;

    @NotBlank(message = "Email is Required")
    @Email(message = "Invalid Mail")
    private String email;
}
