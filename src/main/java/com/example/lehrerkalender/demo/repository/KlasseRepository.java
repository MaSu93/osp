package com.example.lehrerkalender.demo.repository;

import com.example.lehrerkalender.demo.model.Klasse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
/**
 * Liefert Methoden, um mit der "Klasse" Tabelle in der Datenbank zu kommunzieren
 */
public interface KlasseRepository extends JpaRepository<Klasse, Integer> {
   
}
