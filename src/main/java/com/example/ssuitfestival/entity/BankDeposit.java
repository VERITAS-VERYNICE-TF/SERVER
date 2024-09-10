package com.example.ssuitfestival.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BankDeposit {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Basic
    @Column(name = "amount", nullable = false)
    private Integer amount;

    @Basic
    @Column(name = "status", nullable = false)
    private Integer status;

    @Basic
    @Column(name = "createdAt", nullable = false)
    private Timestamp createdAt;

    @Basic
    @Column(name = "updatedAt", nullable = true)
    private Timestamp updatedAt;
}
