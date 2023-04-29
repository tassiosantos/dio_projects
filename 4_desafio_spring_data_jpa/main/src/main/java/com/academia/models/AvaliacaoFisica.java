package com.academia.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class AvaliacaoFisica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "aluno_id", referencedColumnName = "id")
    private Aluno aluno;

    private LocalDateTime dataDaAvaliacao;
    private double peso;
    private double altura;

    // Construtores, getters e setters
}