package com.example.lehrerkalender.demo.controller;

import com.example.lehrerkalender.demo.model.LehrerTermin;
import com.example.lehrerkalender.demo.model.Unterrichtsstunde;
import com.example.lehrerkalender.demo.service.UnterrichtsstundeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/unterrichtsstunde")
public class UnterrichtsstundeController {
    @Autowired
    private UnterrichtsstundeService unterrichtsstundeService;

    @GetMapping("/{id}")
    public Unterrichtsstunde getUnterrichtsstunde(@PathVariable Integer id) {
        return unterrichtsstundeService.getUnterrichtsstunde(id);
    }

    @PostMapping
    public Unterrichtsstunde addUnterrichtsstunde(@RequestBody Unterrichtsstunde unterrichtsstunde) {
        return unterrichtsstundeService.addUnterrichtsstunde(unterrichtsstunde);
    }
}
