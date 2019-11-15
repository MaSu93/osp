package com.example.lehrerkalender.demo.service;

import com.example.lehrerkalender.demo.model.Kurs;
import com.example.lehrerkalender.demo.repository.KursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 * @class KursService
 */
public class KursService {
    @Autowired
    /**
     * @attr {@link KursRepository kursRepository}
     */
    private KursRepository kursRepository;

    /**
     * Liefert den Kurs mit gegebener Id zurück oder einen neuen, wenn er nicht vorhanden ist
     * @param id Integer
     * @return {@link Kurs Kurs}
     */
    public Kurs getKurs(Integer id) {
        return kursRepository.findById(id).orElse(new Kurs());
    }

    /**
     * Der übergebene Kurs wird in der Datenbank gespeichert
     * @param kurs {@link Kurs Kurs}
     * @return {@link Kurs Kurs}
     */
    public Kurs addKurs(Kurs kurs) {
        return kursRepository.save(kurs);
    }
}
