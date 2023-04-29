package com.academia.controllers;

import com.academia.models.Aluno;
import com.academia.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {
    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<Aluno> findAll() {
        return alunoService.findAll();
    }

    @GetMapping("/{id}")
    public Aluno findById(@PathVariable Long id) {
        return alunoService.findById(id);
    }

    @PostMapping
    public Aluno save(@RequestBody Aluno aluno) {
        return alunoService.save(aluno);
    }

    @PutMapping("/{id}")
    public Aluno update(@PathVariable Long id, @RequestBody Aluno aluno) {
        return alunoService.update(id, aluno);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        alunoService.delete(id);
    }
}