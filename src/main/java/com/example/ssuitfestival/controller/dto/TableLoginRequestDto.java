package com.example.ssuitfestival.controller.dto;

import com.example.ssuitfestival.service.dto.TableLoginParamDto;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class TableLoginRequestDto {
    @NotNull(message = "tableNo is null.")
    @Min(value = 1)
    @Max(value = 180)
    private Integer tableNo;

    public TableLoginParamDto toTableLoginParamDto(){
        return TableLoginParamDto.builder()
                .tableNo(this.tableNo)
                .build();
    }
}
