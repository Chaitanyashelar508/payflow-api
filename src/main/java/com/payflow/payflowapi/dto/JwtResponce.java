package com.payflow.payflowapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JwtResponce {

    private String token;
    private String username;

}
