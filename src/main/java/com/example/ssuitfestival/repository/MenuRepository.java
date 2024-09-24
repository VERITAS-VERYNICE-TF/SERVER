package com.example.ssuitfestival.repository;

import com.example.ssuitfestival.entity.Menu;
import com.example.ssuitfestival.repository.mapping.MenuMapping;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
    List<MenuMapping> findAllByIsAvail(Integer avail);
    Optional<Menu> findByIdAndIsAvail(Integer id, Integer isAvail);
}
