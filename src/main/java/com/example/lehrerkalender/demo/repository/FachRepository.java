package com.example.lehrerkalender.demo.repository;

import com.example.lehrerkalender.demo.model.Fach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
/**
 * Liefert Methoden, um mit der "Fach" Tabelle in der Datenbank zu kommunzieren
 */
public interface FachRepository extends JpaRepository<Fach, Integer> {
    boolean existsByName(String name);
}
