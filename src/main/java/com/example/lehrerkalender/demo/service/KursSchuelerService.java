package com.example.lehrerkalender.demo.service;

import com.example.lehrerkalender.demo.model.Kurs;
import com.example.lehrerkalender.demo.model.KursSchueler;
import com.example.lehrerkalender.demo.repository.KursSchuelerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @class KursSchuelerService
 */
@Service
public class KursSchuelerService {
    @Autowired
    /**
     * @attr {@link KursSchuelerRepository kursSchuelerRepository}
     */
    private KursSchuelerRepository kursSchuelerRepository;

    /**
     * Liefert den KursSchueler mit gegebener Id zurück oder einen neuen, wenn sie nicht vorhanden ist
     * @param id Integer
     * @return {@link KursSchueler KursSchueler}
     */
    public KursSchueler getKursSchueler(Integer id) {
        return kursSchuelerRepository.findById(id).orElse(new KursSchueler());
    }

    /**
     * Der übergebene KursSchueler wird in der Datenbank gespeichert
     * @param kursSchueler {@link KursSchueler KursSchueler}
     * @return {@link KursSchueler KursSchueler}
     */
    public KursSchueler addKursSchueler(KursSchueler kursSchueler) {
        return kursSchuelerRepository.save(kursSchueler);
    }
}
