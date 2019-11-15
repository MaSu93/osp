package com.example.lehrerkalender.demo.controller;

import com.example.lehrerkalender.demo.model.Termin;
import com.example.lehrerkalender.demo.service.TerminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/termin")
@Api(value = "TerminControllerAPI", produces = MediaType.APPLICATION_JSON_VALUE)
public class TerminController {
    @Autowired
    private TerminService terminService;

    @GetMapping("/{id}")
    @ApiOperation("holt einen Termin")
    public Termin getTermin(@PathVariable Integer id) {
        return terminService.getTermin(id);
    }

    @PostMapping()
    @ApiOperation("fügt einen Termin hinzu")
    public Termin addTermin(@RequestBody Termin termin) {
        return terminService.addTermin(termin);
    }
}
