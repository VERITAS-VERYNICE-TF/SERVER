package com.example.ssuitfestival.repository;

import com.example.ssuitfestival.entity.TableSession;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TableSessionRepository extends JpaRepository<TableSession, Integer> {
    Optional<TableSession> findByTableNoAndDeletedAtIsNull(Integer tableNo);
    Optional<TableSession> findByIdAndDeletedAtIsNull(Integer id);
}
