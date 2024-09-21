package com.example.ssuitfestival.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TableLoginResponseDto {
    private String accessToken;
}
