package com.example.lehrerkalender.demo.service;

import com.example.lehrerkalender.demo.model.Fach;
import com.example.lehrerkalender.demo.model.Lehrer;
import com.example.lehrerkalender.demo.model.LehrerTermin;
import com.example.lehrerkalender.demo.repository.FachRepository;
import com.example.lehrerkalender.demo.repository.LehrerTerminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @class LehrerTerminService
 */
@Service
public class LehrerTerminService {
    @Autowired
    /**
     * @attr {@link LehrerTerminRepository lehrerTerminRepository}
     */
    private LehrerTerminRepository lehrerTerminRepository;

    /**
     * Liefert den LehrerTermin mit gegebener Id zurück oder einen neuen, wenn sie nicht vorhanden ist
     * @param id Integer
     * @return {@link LehrerTermin LehrerTermin}
     */
    public LehrerTermin getLehrerTermin(Integer id) {
        return lehrerTerminRepository.findById(id).orElse(new LehrerTermin());
    }

    /**
     * Der übergebene LehrerTermin wird in der Datenbank gespeichert
     * @param lehrerTermin {@link LehrerTermin LehrerTermin}
     * @return {@link LehrerTermin LehrerTermin}
     */
    public LehrerTermin addLehrerTermin(LehrerTermin lehrerTermin) {
        return lehrerTerminRepository.save(lehrerTermin);
    }
}
