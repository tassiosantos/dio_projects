package com.academia.main.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;
    private String bairro;
    private LocalDate dataDeNascimento;

    @OneToOne(mappedBy = "aluno", cascade = CascadeType.ALL)
    private AvaliacaoFisica avaliacaoFisica;

    // Construtores, getters e setters
}
