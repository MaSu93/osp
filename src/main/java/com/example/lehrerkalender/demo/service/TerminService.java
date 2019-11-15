package com.example.lehrerkalender.demo.service;

import com.example.lehrerkalender.demo.model.Termin;
import com.example.lehrerkalender.demo.repository.FachRepository;
import com.example.lehrerkalender.demo.repository.TerminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 * @class TerminService
 */
public class TerminService {
    @Autowired
    /**
     * @attr {@link TerminRepository terminRepository}
     */
    private TerminRepository terminRepository;

    /**
     * Liefert den Termin mit gegebener Id zurück oder einen neuen, wenn er nicht vorhanden ist
     * @param id Integer
     * @return {@link Termin Termin}
     */
    public Termin getTermin(Integer id) {
        return terminRepository.findById(id).orElse(new Termin());
    }

    /**
     * Der übergebene Termin wird in der Datenbank gespeichert
     * @param termin {@link Termin Termin}
     * @return {@link Termin Termin}
     */
    public Termin addTermin(Termin termin) {
        return terminRepository.save(termin);
    }
}
