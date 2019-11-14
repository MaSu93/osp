package com.example.lehrerkalender.demo.repository;

import java.time.LocalDate;

import com.example.lehrerkalender.demo.model.Termin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerminRepository extends JpaRepository<Termin, Integer> {
    boolean existsByInhalt(String inhalt);
    boolean existsByBeginn(LocalDate beginn);
}
