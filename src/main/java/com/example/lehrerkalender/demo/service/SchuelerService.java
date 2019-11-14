package com.example.lehrerkalender.demo.service;

import java.util.List;
import com.example.lehrerkalender.demo.model.Schueler;
import com.example.lehrerkalender.demo.model.Klasse;
import com.example.lehrerkalender.demo.repository.SchuelerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 * @class SchuelerService
 */
public class SchuelerService {
    @Autowired
    /**
     * @attr schuelerRepository SchuelerRepository
     */
    private SchuelerRepository schuelerRepository;

    /**
     * Liefert den Schüler mit gegebener Id zurück oder einen neuen, wenn er nicht vorhanden ist
     * @param id Integer
     * @return Schueler
     */
    public Schueler getSchueler(Integer id) {
        return schuelerRepository.findById(id).orElse(new Schueler());
    }

    /**
     * Der übergebene Schüler wird in der Datenbank gespeichert
     * @param schueler Schueler
     * @return Schueler
     */
    public Schueler addSchueler(Schueler schueler) {
        return schuelerRepository.save(schueler);
    }

    /**
     * Liefert alle Schüler in der übergebenen Klasse zurück
     * @param klasse Klasse
     * @return List<Schueler>
     */
    public List<Schueler> getSchuelerByKlasse(Klasse klasse){
        return schuelerRepository.findByKlasse(klasse);
    }
}
