package com.example.lehrerkalender.demo.controller;

import com.example.lehrerkalender.demo.model.Unterrichtsstunde;
import com.example.lehrerkalender.demo.model.UnterrichtsstundeSchueler;
import com.example.lehrerkalender.demo.service.UnterrichtsstundeSchuelerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/unterrichtsstundeSchueler")
@Api(value = "UnterrichtsstundeSchuelerControllerAPI", produces = MediaType.APPLICATION_JSON_VALUE)
public class UnterrichtsstundeSchuelerController {
    @Autowired
    private UnterrichtsstundeSchuelerService unterrichtsstundeSchuelerService;

    @GetMapping("/{id}")
    @ApiOperation("holt die Info eines Schuelers in der Unterrichtsstunde")
    public UnterrichtsstundeSchueler getUnterrichtsstundeSchueler(@PathVariable Integer id) {
        return unterrichtsstundeSchuelerService.getUnterrichtsstundeSchueler(id);
    }

    @PostMapping
    @ApiOperation("fügt eine Info eines Schuelers in der Unterrichtsstunde hinzu")
    public UnterrichtsstundeSchueler addUnterrichtsstundeSchueler(@RequestBody UnterrichtsstundeSchueler unterrichtsstundeSchueler) {
        return unterrichtsstundeSchuelerService.addUnterrichtsstundeSchueler(unterrichtsstundeSchueler);
    }
}
