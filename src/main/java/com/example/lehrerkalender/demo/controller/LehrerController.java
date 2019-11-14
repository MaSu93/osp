package com.example.lehrerkalender.demo.controller;

import com.example.lehrerkalender.demo.model.Lehrer;
import com.example.lehrerkalender.demo.service.LehrerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lehrer")
public class LehrerController {
    @Autowired
    private LehrerService lehrerService;

    @GetMapping("/{nutzerName}")
    public Lehrer getLehrer(@PathVariable String nutzerName) {
        return lehrerService.getLehrer(nutzerName);
    }

    @PostMapping()
    public Lehrer addLehrer(@RequestBody Lehrer lehrer) {
        return lehrerService.addLehrer(lehrer);
    }
}
