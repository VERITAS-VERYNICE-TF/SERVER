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
    @Column(name = "TableSessionId", nullable = false)
    private Integer tableSessionId;

    @Basic
    @Column(name = "price", nullable = false)
    private Integer price;

    @Basic
    @Column(name = "createdAt", nullable = false)
    private Timestamp createdAt;

    @Basic
    @Column(name = "BankDepositIdx", nullable = true)
    private Integer bankDepositIdx;

    @ManyToOne
    @JoinColumn(name = "TableSessionId", referencedColumnName = "id", nullable = false, insertable = false, updatable = false)
    private TableSession tableSessionByTableSessionId;

    @OneToMany(mappedBy = "orderByOrderId")
    private Collection<OrderMenu> orderMenusById;
}
