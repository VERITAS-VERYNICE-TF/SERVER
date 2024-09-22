package com.example.ssuitfestival.repository;

import com.example.ssuitfestival.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {
    long countAllByTableSessionId(Integer tableSessionId);
}
