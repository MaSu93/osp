package com.example.lehrerkalender.demo.repository;

import com.example.lehrerkalender.demo.model.LehrerTermin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Liefert Methoden, um mit der "LehrerTermin" Tabelle in der Datenbank zu kommunzieren
 */
@Repository
public interface LehrerTerminRepository extends JpaRepository<LehrerTermin, Integer> {
}
