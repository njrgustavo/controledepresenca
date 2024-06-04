package com.code.controledepresnca.service;

import com.code.controledepresnca.model.Turma;
import com.code.controledepresnca.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TurmaService {

    @Autowired
    TurmaRepository turmaRepository;

    public List<Turma> findAll(){
        return turmaRepository.findAll();
    }

    public Optional<Turma> findById(long id){
        return turmaRepository.findById(id);
    }

    public Turma save(Turma turma){
        return turmaRepository.save(turma);
    }
}
