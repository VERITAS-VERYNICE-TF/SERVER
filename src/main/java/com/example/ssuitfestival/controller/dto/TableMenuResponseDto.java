package com.example.ssuitfestival.controller.dto;

import com.example.ssuitfestival.repository.mapping.MenuMapping;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class TableMenuResponseDto {
    private List<MenuMapping> menus;
}
