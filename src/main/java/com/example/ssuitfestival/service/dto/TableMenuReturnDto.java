package com.example.ssuitfestival.service.dto;

import com.example.ssuitfestival.controller.dto.TableMenuResponseDto;
import com.example.ssuitfestival.repository.mapping.MenuMapping;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class TableMenuReturnDto {
    private List<MenuMapping> menus;

    @NotNull
    public TableMenuResponseDto toTableMenuResponseDto() {
        return TableMenuResponseDto.builder()
                .menus(this.menus)
                .build();
    }
}
