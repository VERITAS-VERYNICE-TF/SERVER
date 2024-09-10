package com.example.ssuitfestival.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "orders")
public class Orders {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Basic
    @Column(name = "price", nullable = false)
    private Integer price;

    @Basic
    @Column(name = "createdAt", nullable = false)
    private Timestamp createdAt;

    // BankDeposit와의 1:1 관계
    @OneToOne
    @JoinColumn(name = "bankDepositId", referencedColumnName = "id")
    private BankDeposit bankDeposit;

    // TableSession와의 N:1 관계
    @ManyToOne
    @JoinColumn(name = "tableSessionId", nullable = false)
    private TableSession tableSession;

    // OrderMenu와의 1:N 관계
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private Collection<OrderMenu> orderMenus;
}
