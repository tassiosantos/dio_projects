package com.academia.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Matricula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "aluno_id", referencedColumnName = "id")
    private Aluno aluno;

    private LocalDateTime dataDaMatricula;

    // Construtores, getters e setters
}
