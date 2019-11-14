package com.example.lehrerkalender.demo.repository;

import com.example.lehrerkalender.demo.model.Kurs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
/**
 * Liefert Methoden, um mit der "Kurs" Tabelle in der Datenbank zu kommunzieren
 */
public interface KursRepository extends JpaRepository<Kurs, Integer> {
   
}
