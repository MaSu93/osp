package com.example.lehrerkalender.demo.service;

import java.util.List;
import com.example.lehrerkalender.demo.model.Schueler;
import com.example.lehrerkalender.demo.model.Klasse;
import com.example.lehrerkalender.demo.model.SchuelerNotiz;
import com.example.lehrerkalender.demo.repository.FachRepository;
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
     * @attr {@link SchuelerRepository schuelerRepository}
     */
    private SchuelerRepository schuelerRepository;

    /**
     * Liefert den Schüler mit gegebener Id zurück oder einen neuen, wenn er nicht vorhanden ist
     * @param id Integer
     * @return {@link Schueler Schueler}
     */
    public Schueler getSchueler(Integer id) {
        return schuelerRepository.findById(id).orElse(new Schueler());
    }

    /**
     * Der übergebene Schüler wird in der Datenbank gespeichert
     * @param schueler {@link Schueler Schueler}
     * @return {@link Schueler Schueler}
     */
    public Schueler addSchueler(Schueler schueler) {
        return schuelerRepository.save(schueler);
    }

    /**
     * Liefert alle Schüler in der übergebenen Klasse zurück
     * @param klasse {@link Klasse Klasse}
     * @return List&lt;{@link Schueler Schueler}&gt;
     */
    public List<Schueler> getSchuelerByKlasse(Klasse klasse){
        return schuelerRepository.findByKlasse(klasse);
    }
}
