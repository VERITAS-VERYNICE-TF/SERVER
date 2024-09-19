package com.example.ssuitfestival.controller.dto;

import com.example.ssuitfestival.service.dto.TableOrderParamMenuDto;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class TableOrderRequestMenuDto {

    @NotNull(message = "menuId is null.")
    private Integer menuId;

    @NotNull(message = "qty is null.")
    @Min(value = 1)
    private Integer qty;

    public TableOrderParamMenuDto toTableOrderParamMenuDto() {
        return TableOrderParamMenuDto.builder()
                .menuId(this.menuId)
                .qty(this.qty)
                .build();
    }



}
