package com.example.ssuitfestival.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OrderMenu {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Basic
    @Column(name = "qty", nullable = false)
    private Integer qty;

    @Basic
    @Column(name = "status", nullable = false)
    private Integer status;

    // Orders와의 N:1 관계
    @ManyToOne
    @JoinColumn(name = "orderId", nullable = false)
    private Orders order;

    // Menu와의 N:1 관계
    @ManyToOne
    @JoinColumn(name = "menuId", nullable = false)
    private Menu menu;
}
