package com.example.lehrerkalender.demo.repository;

import java.util.List;

import com.example.lehrerkalender.demo.model.Schueler;
import com.example.lehrerkalender.demo.model.Klasse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchuelerRepository extends JpaRepository<Schueler, Integer> {
    List<Schueler> findByKlasse(Klasse klasse);
}
