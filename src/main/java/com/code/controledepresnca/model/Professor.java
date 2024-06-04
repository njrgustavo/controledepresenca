package com.code.controledepresnca.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_professores")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 150)
    private String nome;

    @Column(length = 100)
    private String materia;

    @Column(length = 150)
    private String email;

    @Column(length = 20)
    private String telefone;

    // Getters, setters e outros métodos...
}

