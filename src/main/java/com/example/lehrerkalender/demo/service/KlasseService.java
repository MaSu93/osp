package com.example.lehrerkalender.demo.service;

import com.example.lehrerkalender.demo.model.Klasse;
import com.example.lehrerkalender.demo.repository.KlasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KlasseService {
    @Autowired
    private KlasseRepository klasseRepository;

    public Klasse getKlasse(Integer id) {
        return klasseRepository.findById(id).orElse(new Klasse());
    }

    public Klasse addKlasse(Klasse klasse) {
        return klasseRepository.save(klasse);
    }
}
