package com.example.lehrerkalender.demo.service;

import com.example.lehrerkalender.demo.model.Kurs;
import com.example.lehrerkalender.demo.model.KursSchueler;
import com.example.lehrerkalender.demo.repository.KursSchuelerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KursSchuelerService {
    @Autowired
    private KursSchuelerRepository kursSchuelerRepository;

    public KursSchueler getKursSchueler(Integer id) {
        return kursSchuelerRepository.findById(id).orElse(new KursSchueler());
    }

    public KursSchueler addKursSchueler(KursSchueler kursSchueler) {
        return kursSchuelerRepository.save(kursSchueler);
    }
}
