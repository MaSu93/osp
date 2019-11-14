package com.example.lehrerkalender.demo.controller;

import com.example.lehrerkalender.demo.model.SchuelerNotiz;
import com.example.lehrerkalender.demo.service.SchuelerNotizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/schuelernotiz")
public class SchuelerNotizController {
    @Autowired
    private SchuelerNotizService schuelerNotizService;
 
    @GetMapping("/{id}")
    public SchuelerNotiz getSchuelerNotiz(@PathVariable int id) {
        return schuelerNotizService.getSchuelerNotiz(id);
    }

    @PostMapping()
    public SchuelerNotiz addSchuelerNotiz(@RequestBody SchuelerNotiz schuelerNotiz) {
        return schuelerNotizService.addSchuelerNotiz(schuelerNotiz);
    }

    @GetMapping("/bySchueler/{id}")
    public List<SchuelerNotiz> getAllSchuelerNotizenBySchuelerId(@PathVariable int schuelerId){
        return schuelerNotizService.getSchuelerNotizBySchuelerId(schuelerId);
    }
}
