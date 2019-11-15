package com.example.lehrerkalender.demo.service;

import com.example.lehrerkalender.demo.model.LehrerTermin;
import com.example.lehrerkalender.demo.model.Unterrichtsstunde;
import com.example.lehrerkalender.demo.repository.UnterrichtsstundeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnterrichtsstundeService {
    @Autowired
    private UnterrichtsstundeRepository unterrichtsstundeRepository;

    public Unterrichtsstunde getUnterrichtsstunde(Integer id) {
        return unterrichtsstundeRepository.findById(id).orElse(new Unterrichtsstunde());
    }

    public Unterrichtsstunde addUnterrichtsstunde(Unterrichtsstunde unterrichtsstunde) {
        return unterrichtsstundeRepository.save(unterrichtsstunde);
    }
}
