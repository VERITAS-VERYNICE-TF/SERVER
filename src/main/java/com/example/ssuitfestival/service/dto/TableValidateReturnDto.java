package com.example.ssuitfestival.service.dto;

import com.example.ssuitfestival.entity.TableSession;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TableValidateReturnDto {
    private TableSession tableSession;
}