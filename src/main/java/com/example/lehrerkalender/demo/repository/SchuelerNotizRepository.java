package com.example.lehrerkalender.demo.repository;

import java.util.List;
import com.example.lehrerkalender.demo.model.SchuelerNotiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
/**
 * Liefert Methoden, um mit der "SchuelerNotiz" Tabelle in der Datenbank zu kommunzieren
 */
public interface SchuelerNotizRepository extends JpaRepository<SchuelerNotiz, Integer> {

    List<SchuelerNotiz> findAllBySchuelerId(int id);
}
