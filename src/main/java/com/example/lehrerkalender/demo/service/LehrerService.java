package com.example.lehrerkalender.demo.service;

import com.example.lehrerkalender.demo.model.Lehrer;
import com.example.lehrerkalender.demo.repository.LehrerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 * @class LehrerService
 */
public class LehrerService {
    @Autowired
    /**
     * @attr lehrerRepository LehrerRepository
     */
    private LehrerRepository lehrerRepository;

    /**
     * Liefert den Lehrer mit gegebenem Nutzernamen zurück oder einen neuen, wenn er nicht vorhanden ist
     * @param nutzerName String
     * @return Lehrer
     */
    public Lehrer getLehrer(String nutzerName) {
        return lehrerRepository.findById(nutzerName).orElse(new Lehrer());
    }

    /**
     * Der übergebene Lehrer wird in der Datenbank gespeichert
     * @param lehrer Lehrer
     * @return Lehrer
     */
    public Lehrer addLehrer(Lehrer lehrer) {
        return lehrerRepository.save(lehrer);
    }

    /**
     * Liefert zurück ober der Lehrer mit dem angegebenen Namen unb Passwort in der Datenbank existiert
     * @param lehrer Lehrer
     * @return boolean
     */
    public boolean validateLehrer (Lehrer lehrer){
        return lehrerRepository.existsByNutzerNameAndPasswort(
                lehrer.getNutzerName(),
                lehrer.getPasswort());
    }
}
