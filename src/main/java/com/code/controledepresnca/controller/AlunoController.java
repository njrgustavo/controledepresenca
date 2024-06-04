package com.code.controledepresnca.controller;

import com.code.controledepresnca.model.Aluno;
import com.code.controledepresnca.service.AlunoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@AllArgsConstructor
public class AlunoController {

    AlunoService alunoService;

    @GetMapping(value = "/alunos", produces = "application/json")
    @ResponseBody
    public ResponseEntity<List<Aluno>> getAlunos(){
        List<Aluno> alunos = alunoService.findAll();
        System.out.println("/alunos acessado");

        return ResponseEntity.ok().body(alunos);
    }

    @GetMapping(value = "/alunos/{id}", produces = "application/json")
    @ResponseBody
    public ResponseEntity<Optional<Aluno>> getAlunoById(@PathVariable Long id) {
        Optional<Aluno> aluno = alunoService.findById(id);

        if (aluno.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(aluno);
    }

    @PostMapping(value = "/alunos", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public ResponseEntity<Aluno> saveAluno(@RequestBody Aluno aluno) {
        alunoService.save(aluno);
        System.out.println("Novo aluno salvo: ");
        System.out.println(aluno.toString());
        return ResponseEntity.ok().body(aluno);
    }

}
