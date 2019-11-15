package com.example.lehrerkalender.demo.controller;

import java.util.List;
import com.example.lehrerkalender.demo.model.SchuelerNotiz;
import com.example.lehrerkalender.demo.service.SchuelerNotizService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/schuelernotiz")
@Api(value = "SchuelerNotizControllerAPI", produces = MediaType.APPLICATION_JSON_VALUE)
public class SchuelerNotizController {
    @Autowired
    private SchuelerNotizService schuelerNotizService;
 
    @GetMapping("/{id}")
    @ApiOperation("holt eine SchuelerNotiz")
    public SchuelerNotiz getSchuelerNotiz(@PathVariable Integer id) {
        return schuelerNotizService.getSchuelerNotiz(id);
    }

    @PostMapping()
    @ApiOperation("fügt eine SchuelerNotiz hinzu")
    public SchuelerNotiz addSchuelerNotiz(@RequestBody SchuelerNotiz schuelerNotiz) {
        return schuelerNotizService.addSchuelerNotiz(schuelerNotiz);
    }

    @GetMapping("/bySchueler/{schuelerid}")
    @ApiOperation("holt eine Liste aller Schuelernotizen des Schuelers")
    public List<SchuelerNotiz> getAllSchuelerNotizenBySchuelerId(@PathVariable Integer schuelerId){
        return schuelerNotizService.getAllSchuelerNotizenBySchuelerId(schuelerId);
    }
}
