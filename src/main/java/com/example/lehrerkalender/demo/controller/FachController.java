package com.example.lehrerkalender.demo.controller;


import com.example.lehrerkalender.demo.model.Fach;
import com.example.lehrerkalender.demo.service.FachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fach")
public class FachController {
    @Autowired
    private FachService fachService;

    @GetMapping("/{id}")
    public Fach getFach(@PathVariable Integer id) { return fachService.getFach(id); }

    @PostMapping()
    public Fach addFach(@RequestBody Fach fach) {
        return fachService.addFach(fach);
    }
}
