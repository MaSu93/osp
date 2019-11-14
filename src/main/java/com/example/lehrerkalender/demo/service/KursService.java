package com.example.lehrerkalender.demo.service;

import com.example.lehrerkalender.demo.model.Kurs;
import com.example.lehrerkalender.demo.repository.KursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KursService {
    @Autowired
    private KursRepository kursRepository;

    public Kurs getKurs(Integer id) {
        return kursRepository.findById(id).orElse(new Kurs());
    }

    public Kurs addKurs(Kurs kurs) {
        return kursRepository.save(kurs);
    }
}
