package com.example.lehrerkalender.demo.repository;

import com.example.lehrerkalender.demo.model.KursSchueler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Liefert Methoden, um mit der "KursSchueler" Tabelle in der Datenbank zu kommunzieren
 */
@Repository
public interface KursSchuelerRepository extends JpaRepository<KursSchueler, Integer> {
}
