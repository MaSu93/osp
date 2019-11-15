package com.example.lehrerkalender.demo.controller;

import com.example.lehrerkalender.demo.model.LehrerTermin;
import com.example.lehrerkalender.demo.service.LehrerTerminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/lehrerTermin")
@Api(value = "LehrerTerminControllerAPI", produces = MediaType.APPLICATION_JSON_VALUE)
public class LehrerTerminController {
    @Autowired
    private LehrerTerminService lehrerTerminService;

    @GetMapping("/{id}")
    @ApiOperation("holt den Termin eines Lehrers")
    public LehrerTermin getLehrerTermin(@PathVariable Integer id) {
        return lehrerTerminService.getLehrerTermin(id);
    }

    @PostMapping
    @ApiOperation("fügt den Termin bei einem Lehrer hinzu")
    public LehrerTermin addLehrerTermin(@RequestBody LehrerTermin lehrerTermin) {
        return lehrerTerminService.addLehrerTermin(lehrerTermin);
    }
}
