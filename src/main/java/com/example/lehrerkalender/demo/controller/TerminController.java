package com.example.lehrerkalender.demo.controller;

import com.example.lehrerkalender.demo.model.Termin;
import com.example.lehrerkalender.demo.service.TerminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/termin")
public class TerminController {
    @Autowired
    private TerminService terminService;

    @GetMapping("/{id}")
    public Termin getTermin(@PathVariable Integer id) {
        return terminService.getTermin(id);
    }

    @PostMapping()
    public Termin addTermin(@RequestBody Termin termin) {
        return terminService.addTermin(termin);
    }
}
