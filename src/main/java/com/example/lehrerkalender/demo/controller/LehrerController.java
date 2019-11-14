package com.example.lehrerkalender.demo.controller;

import com.example.lehrerkalender.demo.model.Lehrer;
import com.example.lehrerkalender.demo.service.LehrerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/lehrer")
@Api(value = "LehrerControllerAPI", produces = MediaType.APPLICATION_JSON_VALUE)
public class LehrerController {
    @Autowired
    private LehrerService lehrerService;

    @GetMapping("/{nutzerName}")
    @ApiOperation("holt einen Lehrer ")
    public Lehrer getLehrer(@PathVariable String nutzerName) {
        return lehrerService.getLehrer(nutzerName);
    }

    @PostMapping()
    @ApiOperation("fügt einen Lehrer hinzu")
    public Lehrer addLehrer(@RequestBody Lehrer lehrer) {
        return lehrerService.addLehrer(lehrer);
    }

    @PostMapping("/validate")
    public boolean validateLehrer (@RequestBody Lehrer lehrer) {
        return lehrerService.validateLehrer(lehrer);
    }
}
