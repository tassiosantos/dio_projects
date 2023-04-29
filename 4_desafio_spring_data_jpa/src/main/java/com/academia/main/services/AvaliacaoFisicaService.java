package com.academia.main.services;

import com.academia.main.models.AvaliacaoFisica;
import com.academia.main.repositories.AvaliacaoFisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.beans.BeanUtils;



import java.util.List;

@Service
public class AvaliacaoFisicaService {
@Autowired
private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

public List<AvaliacaoFisica> findAll() {
    return avaliacaoFisicaRepository.findAll();
}

public AvaliacaoFisica findById(Long id) {
    return avaliacaoFisicaRepository.findById(id).orElseThrow(() -> new RuntimeException("Avaliação física não encontrada"));
}

public AvaliacaoFisica save(AvaliacaoFisica avaliacaoFisica) {
    return avaliacaoFisicaRepository.save(avaliacaoFisica);
}

public AvaliacaoFisica update(Long id, AvaliacaoFisica avaliacaoFisica) {
    AvaliacaoFisica avaliacaoFisicaExistente = findById(id);
    BeanUtils.copyProperties(avaliacaoFisica, avaliacaoFisicaExistente, "id");
    return avaliacaoFisicaRepository.save(avaliacaoFisicaExistente);
}

public void delete(Long id) {
    avaliacaoFisicaRepository.deleteById(id);
}

}