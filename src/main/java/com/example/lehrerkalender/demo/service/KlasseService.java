package com.example.lehrerkalender.demo.service;

import com.example.lehrerkalender.demo.model.Klasse;
import com.example.lehrerkalender.demo.repository.KlasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 * @class KlasseService
 */
public class KlasseService {
    @Autowired
    /**
     * @attr klassePepository KlasseRepository
     */
    private KlasseRepository klasseRepository;

    /**
     * Liefert die Klasse mit gegebener Id zurück oder eine neue, wenn sie nicht vorhanden ist
     * @param id Integer
     * @return Klasse
     */
    public Klasse getKlasse(Integer id) {
        return klasseRepository.findById(id).orElse(new Klasse());
    }

    /**
     * Die übergebene Klasse wird in der Datenbank gespeichert
     * @param klasse Klasse
     * @return Klasse
     */
    public Klasse addKlasse(Klasse klasse) {
        return klasseRepository.save(klasse);
    }
}
