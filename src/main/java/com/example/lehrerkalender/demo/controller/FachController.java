package com.example.lehrerkalender.demo.controller;

import com.example.lehrerkalender.demo.model.Fach;
import com.example.lehrerkalender.demo.service.FachService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fach")
@Api(value = "FachControllerAPI", produces = MediaType.APPLICATION_JSON_VALUE)
public class FachController {
    @Autowired
    private FachService fachService;

    @GetMapping("/{id}")
    @ApiOperation("holt ein Fach")
    public Fach getFach(@PathVariable Integer id) { return fachService.getFach(id); }

    @PostMapping()
    @ApiOperation("fügt ein Fach hinzu")
    public Fach addFach(@RequestBody Fach fach) {
        return fachService.addFach(fach);
    }
}
