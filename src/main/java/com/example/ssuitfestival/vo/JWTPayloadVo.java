package com.example.ssuitfestival.vo;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class JWTPayloadVo {
    private Integer tableNo;
    private Integer sessionId;
}