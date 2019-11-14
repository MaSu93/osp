package com.example.lehrerkalender.demo.service;

import com.example.lehrerkalender.demo.model.Lehrer;
import com.example.lehrerkalender.demo.model.LehrerTermin;
import com.example.lehrerkalender.demo.repository.LehrerTerminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LehrerTerminService {
    @Autowired
    private LehrerTerminRepository lehrerTerminRepository;

    public LehrerTermin getLehrerTermin(Integer id) {
        return lehrerTerminRepository.findById(id).orElse(new LehrerTermin());
    }

    public LehrerTermin addLehrerTermin(LehrerTermin lehrerTermin) {
        return lehrerTerminRepository.save(lehrerTermin);
    }
}
