package com.example.ssuitfestival.service.dto;

import com.example.ssuitfestival.controller.dto.TableLoginResponseDto;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TableLoginReturnDto {
    private String accessToken;

    @NotNull
    public TableLoginResponseDto toTableLoginResponseDto(){
        return TableLoginResponseDto.builder()
                .accessToken(this.accessToken)
                .build();
    }
}
