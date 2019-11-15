package com.example.lehrerkalender.demo.repository;

import com.example.lehrerkalender.demo.model.Lehrer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
/**
 * Liefert Methoden, um mit der "Lehrer" Tabelle in der Datenbank zu kommunzieren
 */
public interface LehrerRepository extends JpaRepository<Lehrer, String> {
    boolean existsByNutzerNameAndPasswort(String nutzerName, String passwort);
}
