package com.example.lehrerkalender.demo.controller;

import com.example.lehrerkalender.demo.model.LehrerTermin;
import com.example.lehrerkalender.demo.service.LehrerTerminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/lehrerTermin")
public class LehrerTerminController {
    @Autowired
    private LehrerTerminService lehrerTerminService;

    @GetMapping("/{id}")
    public LehrerTermin getLehrerTermin(@PathVariable Integer id) {
        return lehrerTerminService.getLehrerTermin(id);
    }

    @PostMapping
    public LehrerTermin addLehrerTermin(@RequestBody LehrerTermin lehrerTermin) {
        return lehrerTerminService.addLehrerTermin(lehrerTermin);
    }
}
