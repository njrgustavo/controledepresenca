package com.code.controledepresnca.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_frequencias")
public class Frequencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aula_id")
    private Aula aula;

    @Column(nullable = false)
    private Boolean presente; // True se presente, False se ausente

    private String motivoFalta;



    // Getters, setters e outros métodos...
}
