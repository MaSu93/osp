package com.example.lehrerkalender.demo.service;

import com.example.lehrerkalender.demo.model.Termin;
import com.example.lehrerkalender.demo.repository.TerminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TerminService {
    @Autowired
    private TerminRepository terminRepository;

    public Termin getTermin(Integer id) { return terminRepository.findById(id).orElse(new Termin()); }

    public Termin addTermin(Termin termin) {
        return terminRepository.save(termin);
    }
}
