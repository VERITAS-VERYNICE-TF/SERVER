package com.example.ssuitfestival.controller.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class BankDepositRequestDto {
    @NotEmpty(message = "from is empty.")
    private String from;

    @NotEmpty(message = "content is empty.")
    private String content;

}
