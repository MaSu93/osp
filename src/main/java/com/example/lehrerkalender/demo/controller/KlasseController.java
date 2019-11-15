package com.example.lehrerkalender.demo.controller;

import com.example.lehrerkalender.demo.model.Klasse;
import com.example.lehrerkalender.demo.service.KlasseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/klasse")
@Api(value = "KlasseControllerAPI", produces = MediaType.APPLICATION_JSON_VALUE)
public class KlasseController {
    @Autowired
    private KlasseService klasseService;

    @GetMapping("/{id}")
    @ApiOperation("holt eine Klasse")
    public Klasse getKlasse(@PathVariable Integer id) {
        return klasseService.getKlasse(id);
    }

    @PostMapping()
    @ApiOperation("fügt eine Klasse hinzu")
    public Klasse addKlasse(@RequestBody Klasse klasse) {
        return klasseService.addKlasse(klasse);
    }

}
