package com.example.lehrerkalender.demo.controller;

import java.util.List;
import com.example.lehrerkalender.demo.model.Schueler;
import com.example.lehrerkalender.demo.model.Klasse;
import com.example.lehrerkalender.demo.service.SchuelerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/schueler")
@Api(value = "SchuelerControllerAPI", produces = MediaType.APPLICATION_JSON_VALUE)
public class SchuelerController {
    @Autowired
    private SchuelerService schuelerService;
 
    @GetMapping("/{id}")
    @ApiOperation("holt einen Schueler")
    public Schueler getSchueler(@PathVariable Integer id) {
        return schuelerService.getSchueler(id);
    }

    @PostMapping()
    @ApiOperation("fügt einen Schueler hinzu")
    public Schueler addSchueler(@RequestBody Schueler schueler) {
        return schuelerService.addSchueler(schueler);
    }

    @GetMapping("/byKlasse")
    @ApiOperation("holt die Schuelerliste einer Klasse")
    public List<Schueler> getSchuelerByKlasse(@RequestBody Klasse klasse){
        return schuelerService.getSchuelerByKlasse(klasse);
    }
}
