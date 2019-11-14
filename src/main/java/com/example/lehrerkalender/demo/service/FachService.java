package com.example.lehrerkalender.demo.service;

import com.example.lehrerkalender.demo.model.Fach;
import com.example.lehrerkalender.demo.repository.FachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FachService {
    @Autowired
    private FachRepository fachRepository;

    public Fach getFach(Integer id) { return fachRepository.findById(id).orElse(new Fach()); }

    public Fach addFach(Fach fach) {
        return fachRepository.save(fach);
    }
}
