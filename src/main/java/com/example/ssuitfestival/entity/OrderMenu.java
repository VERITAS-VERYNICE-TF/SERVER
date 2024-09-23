package com.example.ssuitfestival.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class OrderMenu {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Basic
    @Column(name = "qty", nullable = false)
    private Integer qty;

    @Column(name = "OrderId", nullable = false)
    private Integer orderId;
    @Basic
    @Column(name = "MenuId", nullable = false)
    private Integer menuId;

    @Basic
    @Column(name = "status", nullable = false)
    private Integer status;

    // Orders와의 N:1 관계
    @ManyToOne
    @JoinColumn(name = "OrderId", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    private Orders orderByOrderId;

    // Menu와의 N:1 관계
    @ManyToOne
    @JoinColumn(name = "MenuId", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    private Menu menuByMenuId;
}
