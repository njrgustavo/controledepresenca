package com.code.controledepresnca.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_turma")
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @ManyToMany(mappedBy = "turmas")
    private List<Aluno> alunos;


}

