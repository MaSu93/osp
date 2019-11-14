package com.example.lehrerkalender.demo.controller;

import com.example.lehrerkalender.demo.model.Klasse;
import com.example.lehrerkalender.demo.service.LehrerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/klasse")
public class KlasseController {
    @Autowired
    private KlasseService klasseService;

    @GetMapping("/{id}")
    public Lehrer getLehrer(@PathVariable int id) {
        return klasseService.getKlasse(id);
    }

}
