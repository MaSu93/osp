package com.example.lehrerkalender.demo.service;

import com.example.lehrerkalender.demo.model.SchuelerNotiz;
import com.example.lehrerkalender.demo.repository.SchuelerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchuelerNotizService {
    @Autowired
    private SchuelerNotizRepository schuelerNotizRepository;

    public SchuelerNotiz getSchuelerNotiz(int id) {
        return schuelerNotizRepository.findById(id).orElse(new SchuelerNotiz());
    }

    public SchuelerNotiz addSchuelerNotiz(SchuelerNotiz schuelerNotiz) {
        return schuelerNotizRepository.save(schuelerNotiz);
    }

    public List<SchuelerNotiz> getAllSchuelerNotizenBySchuelerId(int schuelerId){
        return schuelerNotizRepository.findAllBySchuelerId(schuelerId);
    }
}
