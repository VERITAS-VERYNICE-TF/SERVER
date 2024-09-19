package com.example.ssuitfestival.controller.dto;

import com.example.ssuitfestival.service.dto.TableOrderParamDto;
import com.example.ssuitfestival.service.dto.TableOrderParamMenuDto;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TableOrderRequestDto {

    @NotNull(message = "menu is null.")
    @Valid
    private List<TableOrderRequestMenuDto> menus;

    @NotEmpty(message = "name is empty.")
    private String name;

    public TableOrderParamDto toTableOrderParamDto(Integer sessionId) {
        ArrayList<TableOrderParamMenuDto> menus = new ArrayList<>();
        for(TableOrderRequestMenuDto menu : this.menus){
            menus.add(menu.toTableOrderParamMenuDto());
        }

        return TableOrderParamDto.builder()
                .menus(menus)
                .name(this.name)
                .build();
    }

}
