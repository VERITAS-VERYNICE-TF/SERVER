package com.example.ssuitfestival.repository;

import com.example.ssuitfestival.entity.BankDeposit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BankDepositRepository extends JpaRepository<BankDeposit, Integer> {
    Optional<BankDeposit> findByNameAndAmountAndStatus(String name, Integer amount, Integer status);
}
