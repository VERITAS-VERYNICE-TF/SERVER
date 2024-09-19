package com.example.ssuitfestival.controller.dto;

import com.example.ssuitfestival.service.dto.BankDepositParamDto;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class BankDepositRequestDto {
    @NotEmpty(message = "from is empty.")
    private String from;

    @NotEmpty(message = "content is empty.")
    private String content;

    public BankDepositParamDto toBankDepositParamDto(String key){
        return BankDepositParamDto.builder()
                .key(key)
                .from(this.from)
                .content(this.content)
                .build();
    }

}
