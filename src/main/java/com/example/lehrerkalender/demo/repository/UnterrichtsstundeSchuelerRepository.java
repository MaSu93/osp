package com.example.lehrerkalender.demo.repository;

import com.example.lehrerkalender.demo.model.UnterrichtsstundeSchueler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Liefert Methoden, um mit der "UnterrichtsstundeSchueler" Tabelle in der Datenbank zu kommunzieren
 */
@Repository
public interface UnterrichtsstundeSchuelerRepository extends JpaRepository<UnterrichtsstundeSchueler, Integer> {
}
