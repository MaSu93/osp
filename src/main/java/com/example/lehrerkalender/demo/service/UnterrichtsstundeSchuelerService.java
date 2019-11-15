package com.example.lehrerkalender.demo.service;

import com.example.lehrerkalender.demo.model.Schueler;
import com.example.lehrerkalender.demo.model.Termin;
import com.example.lehrerkalender.demo.model.UnterrichtsstundeSchueler;
import com.example.lehrerkalender.demo.repository.SchuelerRepository;
import com.example.lehrerkalender.demo.repository.UnterrichtsstundeSchuelerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 * @class UnterrichtsstundeSchuelerService
 */
public class UnterrichtsstundeSchuelerService {
    /**
     * @attr {@link UnterrichtsstundeSchuelerRepository unterrichtsstundeSchuelerRepository}
     */
    @Autowired
    private UnterrichtsstundeSchuelerRepository unterrichtsstundeSchuelerRepository;

    /**
     * Liefert eine Instanz von UnterrichtsstundeSchueler mit gegebener Id zurück oder einen neuen, wenn er nicht vorhanden ist
     * @param id Integer
     * @return {@link UnterrichtsstundeSchueler UnterrichtsstundeSchueler}
     */
    public UnterrichtsstundeSchueler getUnterrichtsstundeSchueler(Integer id) { return unterrichtsstundeSchuelerRepository.findById(id).orElse(new UnterrichtsstundeSchueler()); }

    /**
     * Der übergebene UnterrichtsstundeSchueler wird in der Datenbank gespeichert
     * @param unterrichtsstundeSchueler {@link UnterrichtsstundeSchueler UnterrichtsstundeSchueler}
     * @return {@link UnterrichtsstundeSchueler UnterrichtsstundeSchueler}
     */
    public UnterrichtsstundeSchueler addUnterrichtsstundeSchueler(UnterrichtsstundeSchueler unterrichtsstundeSchueler) {
        return unterrichtsstundeSchuelerRepository.save(unterrichtsstundeSchueler);
    }
}
