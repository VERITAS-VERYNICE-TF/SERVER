package com.example.ssuitfestival.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;

@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Menu {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Basic
    @Column(name = "title", nullable = false, length = 50)
    private String title;

    @Basic
    @Column(name = "price", nullable = false)
    private Integer price;

    @Basic
    @Column(name = "detail", nullable = true, length = 300)
    private String detail;

    @Basic
    @Column(name = "imgUrl", nullable = false, length = 100)
    private String imgUrl;

    @Basic
    @Column(name = "isAvail", nullable = false)
    private Integer isAvail;

    @Basic
    @Column(name = "team", nullable = false)
    private String team;

    @OneToMany(mappedBy = "menuByMenuId")
    private Collection<OrderMenu> orderMenusById;
}
