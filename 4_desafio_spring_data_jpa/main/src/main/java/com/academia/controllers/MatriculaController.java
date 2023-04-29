package com.academia.controllers;

import com.academia.models.Matricula;
import com.academia.services.MatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/matriculas")
public class MatriculaController {
    @Autowired
    private MatriculaService matriculaService;

    @GetMapping
    public List<Matricula> findAll() {
        return matriculaService.findAll();
    }

    @GetMapping("/{id}")
    public Matricula findById(@PathVariable Long id) {
        return matriculaService.findById(id);
    }

    @PostMapping
    public Matricula save(@RequestBody Matricula matricula) {
        return matriculaService.save(matricula);
    }

    @PutMapping("/{id}")
    public Matricula update(@PathVariable Long id, @RequestBody Matricula matricula) {
        return matriculaService.update(id, matricula);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        matriculaService.delete(id);
    }
}
