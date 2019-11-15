package com.example.lehrerkalender.demo.service;

import com.example.lehrerkalender.demo.model.LehrerTermin;
import com.example.lehrerkalender.demo.model.Unterrichtsstunde;
import com.example.lehrerkalender.demo.model.UnterrichtsstundeSchueler;
import com.example.lehrerkalender.demo.repository.UnterrichtsstundeRepository;
import com.example.lehrerkalender.demo.repository.UnterrichtsstundeSchuelerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
/**
 * @class UnterrichtsstundeService
 */
public class UnterrichtsstundeService {
    /**
     * @attr {@link UnterrichtsstundeRepository unterrichtsstundeRepository}
     */
    @Autowired
    private UnterrichtsstundeRepository unterrichtsstundeRepository;

    /**
     * Liefert eine Unterrichtsstunde mit gegebener Id zurück oder eine neue, wenn er nicht vorhanden ist
     * @param id Integer
     * @return {@link Unterrichtsstunde Unterrichtsstunde}
     */
    public Unterrichtsstunde getUnterrichtsstunde(Integer id) {
        return unterrichtsstundeRepository.findById(id).orElse(new Unterrichtsstunde());
    }

    /**
     * Die übergebene Unterrichtsstunde wird in der Datenbank gespeichert
     * @param unterrichtsstunde {@link Unterrichtsstunde Unterrichtsstunde}
     * @return {@link Unterrichtsstunde Unterrichtsstunde}
     */
    public Unterrichtsstunde addUnterrichtsstunde(Unterrichtsstunde unterrichtsstunde) {
        return unterrichtsstundeRepository.save(unterrichtsstunde);
    }
}
