package com.example.lehrerkalender.demo.controller;

import com.example.lehrerkalender.demo.model.Unterrichtsstunde;
import com.example.lehrerkalender.demo.model.UnterrichtsstundeSchueler;
import com.example.lehrerkalender.demo.service.UnterrichtsstundeSchuelerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/unterrichtsstundeSchueler")
public class UnterrichtsstundeSchuelerController {
    @Autowired
    private UnterrichtsstundeSchuelerService unterrichtsstundeSchuelerService;

    @GetMapping("/{id}")
    public UnterrichtsstundeSchueler getUnterrichtsstundeSchueler(@PathVariable Integer id) {
        return unterrichtsstundeSchuelerService.getUnterrichtsstundeSchueler(id);
    }

    @PostMapping
    public UnterrichtsstundeSchueler addUnterrichtsstundeSchueler(@RequestBody UnterrichtsstundeSchueler unterrichtsstundeSchueler) {
        return unterrichtsstundeSchuelerService.addUnterrichtsstundeSchueler(unterrichtsstundeSchueler);
    }
}
