package com.example.lehrerkalender.demo.service;

import com.example.lehrerkalender.demo.model.Lehrer;
import com.example.lehrerkalender.demo.repository.LehrerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LehrerService {
    @Autowired
    private LehrerRepository lehrerRepository;

    public Lehrer getLehrer(String nutzerName) {
        return lehrerRepository.findById(nutzerName).orElse(new Lehrer());
    }

    public Lehrer addLehrer(Lehrer lehrer) {
        return lehrerRepository.save(lehrer);
    }
}
