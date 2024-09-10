package com.example.ssuitfestival.entity;

import com.example.ssuitfestival.entity.enums.MenuStatus;
import com.example.ssuitfestival.entity.enums.Team;
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

    @Enumerated(EnumType.STRING)
    @Column(name = "menuStatus", nullable = false)
    private MenuStatus menuStatus;

    @Enumerated(EnumType.STRING)
    @Column(name = "team", nullable = false)
    private Team team;

    // OrderMenu와의 1:N 관계
    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL)
    private Collection<OrderMenu> orderMenus;
}
