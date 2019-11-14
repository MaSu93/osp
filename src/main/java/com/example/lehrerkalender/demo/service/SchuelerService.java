package com.example.lehrerkalender.demo.service;

import java.util.List;
import com.example.lehrerkalender.demo.model.Schueler;
import com.example.lehrerkalender.demo.model.Klasse;
import com.example.lehrerkalender.demo.repository.SchuelerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchuelerService {
    @Autowired
    private SchuelerRepository schuelerRepository;

    public Schueler getSchueler(Integer id) {
        return schuelerRepository.findById(id).orElse(new Schueler());
    }

    public Schueler addSchueler(Schueler schueler) {
        return schuelerRepository.save(schueler);
    }

    public List<Schueler> getSchuelerByKlasse(Klasse klasse){
        return schuelerRepository.findByKlasse(klasse);
    }
}
