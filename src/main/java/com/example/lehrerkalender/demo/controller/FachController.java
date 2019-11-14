package com.example.lehrerkalender.demo.controller;


import com.example.lehrerkalender.demo.model.Fach;
import com.example.lehrerkalender.demo.service.FachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fach")
public class FachController {
    @Autowired
    private FachService fachService;

    @GetMapping("/{nutzerName}")
    public Fach getFach(@PathVariable String nutzerName) {
        return fachService.getFach(nutzerName);
    }

    @PostMapping()
    public Fach addFach(@RequestBody Fach fach) {
        return fachService.addFach(fach);
    }
}
