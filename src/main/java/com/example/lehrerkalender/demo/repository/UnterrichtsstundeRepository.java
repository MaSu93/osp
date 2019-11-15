package com.example.lehrerkalender.demo.repository;

import com.example.lehrerkalender.demo.model.Unterrichtsstunde;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Liefert Methoden, um mit der "Unterrichtsstunde" Tabelle in der Datenbank zu kommunzieren
 */
@Repository
public interface UnterrichtsstundeRepository extends JpaRepository<Unterrichtsstunde, Integer> {
}
