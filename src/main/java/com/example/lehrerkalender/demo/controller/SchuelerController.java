package com.example.lehrerkalender.demo.controller;

import com.example.lehrerkalender.demo.model.Schueler;
import com.example.lehrerkalender.demo.service.SchuelerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/schueler")
public class SchuelerController {
    @Autowired
    private SchuelerService schuelerService;
 
    @GetMapping("/{id}")
    public Schueler getSchueler(@PathVariable int id) {
        return schuelerService.getSchueler(id);
    }

    @PostMapping()
    public Schueler addSchueler(@RequestBody Schueler schueler) {
        return schuelerService.addSchueler(schueler);
    }

    @GetMapping("/byClass")
    public List<Schueler> getSchuelerByKlasse(@RequestBody Klasse klasse){
        return schuelerService.getSchuelerByKlasse(klasse);
    }
}
