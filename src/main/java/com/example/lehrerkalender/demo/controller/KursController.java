package com.example.lehrerkalender.demo.controller;

import com.example.lehrerkalender.demo.model.Kurs;
import com.example.lehrerkalender.demo.service.KursService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kurs")
@Api(value = "KursControllerAPI", produces = MediaType.APPLICATION_JSON_VALUE)
public class KursController {
    @Autowired
    private KursService kursService;

    @GetMapping("/{id}")
    @ApiOperation("holt einen Kurs")
    public Kurs getKurs(@PathVariable Integer id) {
        return kursService.getKurs(id);
    }

    @PostMapping()
    @ApiOperation("fügt einen Kurs hinzu")
    public Kurs addKurs(@RequestBody Kurs kurs) {
        return kursService.addKurs(kurs);
    }

}
