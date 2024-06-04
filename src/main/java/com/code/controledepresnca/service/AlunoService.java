package com.code.controledepresnca.service;


import com.code.controledepresnca.model.Aluno;
import com.code.controledepresnca.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    public List<Aluno> findAll(){
        return alunoRepository.findAll();
    }

    public Optional<Aluno> findById(long id){
        return alunoRepository.findById(id);
    }

    public Aluno save(Aluno aluno){
       return alunoRepository.save(aluno);
    }

}
