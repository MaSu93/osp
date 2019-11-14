package com.example.lehrerkalender.demo.controller;

import com.example.lehrerkalender.demo.model.Schueler;
import com.example.lehrerkalender.demo.service.SchuelerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/schueler")
public class schuelerController {
    @Autowired
    private SchuelerService schuelerService;
  /**
     * Holt den {@link <schueler schueler>} mit dem übergebenen Parameter
     * @param nutzerName Die ID des Schülers
     * @return Gibt den gefundenen Lehrer zurück
     */
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
