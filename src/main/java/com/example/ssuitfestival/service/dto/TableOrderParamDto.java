package com.example.ssuitfestival.service.dto;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class TableOrderParamDto {
    private Integer sessionId;
    private List<TableOrderParamMenuDto> menus;
    private String name;
}
