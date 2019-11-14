package com.example.lehrerkalender.demo.service;

import com.example.lehrerkalender.demo.model.Schueler;
import com.example.lehrerkalender.demo.repository.SchuelerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchuelerService {
    @Autowired
    private SchuelerRepository schuelerRepository;

    public Schueler getSchueler(int id) {
        return schuelerRepository.findById(nutzerName).orElse(new Schueler());
    }

    public Schueler addSchueler(Schueler schueler) {
        return schuelerRepository.save(schueler);
    }

    public List<Schueler> getSchuelerByKlasse(Klasse klasse){
        return schuelerRepository.findByKlasse(klasse);
    }
}
