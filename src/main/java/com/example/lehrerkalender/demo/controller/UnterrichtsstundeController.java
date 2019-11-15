package com.example.lehrerkalender.demo.controller;

import com.example.lehrerkalender.demo.model.LehrerTermin;
import com.example.lehrerkalender.demo.model.Unterrichtsstunde;
import com.example.lehrerkalender.demo.service.UnterrichtsstundeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/unterrichtsstunde")
@Api(value = "UnterrichtsstundeControllerAPI", produces = MediaType.APPLICATION_JSON_VALUE)
public class UnterrichtsstundeController {
    @Autowired
    private UnterrichtsstundeService unterrichtsstundeService;

    @GetMapping("/{id}")
    @ApiOperation("holt eine Unterrichtsstunde")
    public Unterrichtsstunde getUnterrichtsstunde(@PathVariable Integer id) {
        return unterrichtsstundeService.getUnterrichtsstunde(id);
    }

    @PostMapping
    @ApiOperation("fügt eine Unterrichtsstunde hinzu")
    public Unterrichtsstunde addUnterrichtsstunde(@RequestBody Unterrichtsstunde unterrichtsstunde) {
        return unterrichtsstundeService.addUnterrichtsstunde(unterrichtsstunde);
    }
}
