package com.academia.controllers;

import com.academia.models.AvaliacaoFisica;
import com.academia.services.AvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/avaliacoes-fisicas")
public class AvaliacaoFisicaController {
    @Autowired
    private AvaliacaoFisicaService avaliacaoFisicaService;

    @GetMapping
    public List<AvaliacaoFisica> findAll() {
        return avaliacaoFisicaService.findAll();
    }

    @GetMapping("/{id}")
    public AvaliacaoFisica findById(@PathVariable Long id) {
        return avaliacaoFisicaService.findById(id);
    }

    @PostMapping
    public AvaliacaoFisica save(@RequestBody AvaliacaoFisica avaliacaoFisica) {
        return avaliacaoFisicaService.save(avaliacaoFisica);
    }

    @PutMapping("/{id}")
    public AvaliacaoFisica update(@PathVariable Long id, @RequestBody AvaliacaoFisica avaliacaoFisica) {
        return avaliacaoFisicaService.update(id, avaliacaoFisica);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        avaliacaoFisicaService.delete(id);
    }
}