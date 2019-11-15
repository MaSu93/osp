package com.example.lehrerkalender.demo.service;

import com.example.lehrerkalender.demo.model.Fach;
import com.example.lehrerkalender.demo.repository.FachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 * @class FachService
 */
public class FachService {
    @Autowired
    /**
     * @attr fachRepository FachRepository
     */
    private FachRepository fachRepository;

    /**
     * Liefert das Fach mit gegebener Id zurück oder ein neues, wenn sie nicht vorhanden ist
     * @param id Integer
     * @return Fach
     */
    public Fach getFach(Integer id) { return fachRepository.findById(id).orElse(new Fach()); }

    /**
     * Das übergebene Fach wird in der Datenbank gespeichert
     * @param fach Fach
     * @return Fach
     */
    public Fach addFach(Fach fach) {
        return fachRepository.save(fach);
    }
}
