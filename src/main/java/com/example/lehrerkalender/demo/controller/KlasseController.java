package com.example.lehrerkalender.demo.controller;

import com.example.lehrerkalender.demo.model.Klasse;
import com.example.lehrerkalender.demo.service.KlasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/klasse")
public class KlasseController {
    @Autowired
    private KlasseService klasseService;

    @GetMapping("/{id}")
    public Klasse getKlasse(@PathVariable Integer id) {
        return klasseService.getKlasse(id);
    }

    @PostMapping()
    public Klasse addKlasse(@RequestBody Klasse klasse) {
        return klasseService.addKlasse(klasse);
    }

}
