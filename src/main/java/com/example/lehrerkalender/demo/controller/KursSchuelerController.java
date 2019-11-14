package com.example.lehrerkalender.demo.controller;

import com.example.lehrerkalender.demo.model.KursSchueler;
import com.example.lehrerkalender.demo.service.KursSchuelerService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kursSchueler")
@Api(value = "KursSchuelerControllerAPI", produces = MediaType.APPLICATION_JSON_VALUE)
public class KursSchuelerController {
    @Autowired
    private KursSchuelerService kursSchuelerService;

    @GetMapping("/{id}")
    public KursSchueler getKursSchueler(@PathVariable Integer id) {
        return kursSchuelerService.getKursSchueler(id);
    }

    @PostMapping()
    public KursSchueler addKursSchueler(@RequestBody KursSchueler kursSchueler) {
        return kursSchuelerService.addKursSchueler(kursSchueler);
    }
}
