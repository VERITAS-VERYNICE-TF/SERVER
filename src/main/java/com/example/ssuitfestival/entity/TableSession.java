package com.example.ssuitfestival.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TableSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "tableNo", nullable = false)
    private Integer tableNo;

    @Column(name = "createdAt", nullable = false)
    private Timestamp createdAt;

    @Column(name = "deletedAt", nullable = true)
    private Timestamp deletedAt;
}
