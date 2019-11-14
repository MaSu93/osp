package com.example.lehrerkalender.demo.controller;

import com.example.lehrerkalender.demo.model.Kurs;
import com.example.lehrerkalender.demo.service.KursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kurs")
public class KursController {
    @Autowired
    private KursService kursService;

    @GetMapping("/{id}")
    public Kurs getKurs(@PathVariable int id) {
        return kursService.getKurs(id);
    }

}
