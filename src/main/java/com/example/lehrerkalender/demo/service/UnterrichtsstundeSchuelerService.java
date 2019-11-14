package com.example.lehrerkalender.demo.service;

import com.example.lehrerkalender.demo.model.Termin;
import com.example.lehrerkalender.demo.model.UnterrichtsstundeSchueler;
import com.example.lehrerkalender.demo.repository.UnterrichtsstundeSchuelerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnterrichtsstundeSchuelerService {
    @Autowired
    private UnterrichtsstundeSchuelerRepository unterrichtsstundeSchuelerRepository;

    public UnterrichtsstundeSchueler getUnterrichtsstundeSchueler(Integer id) { return unterrichtsstundeSchuelerRepository.findById(id).orElse(new UnterrichtsstundeSchueler()); }

    public UnterrichtsstundeSchueler addUnterrichtsstundeSchueler(UnterrichtsstundeSchueler unterrichtsstundeSchueler) {
        return unterrichtsstundeSchuelerRepository.save(unterrichtsstundeSchueler);
    }
}
