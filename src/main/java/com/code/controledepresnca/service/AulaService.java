package com.code.controledepresnca.service;

import com.code.controledepresnca.model.Aula;
import com.code.controledepresnca.repository.AulaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AulaService {

    @Autowired
    AulaRepository aulaRepository;

    public List<Aula> findAll(){
        return aulaRepository.findAll();
    }

    public Optional<Aula> findById(long id){
        return aulaRepository.findById(id);
    }

    public Aula save(Aula aula){
        return aulaRepository.save(aula);
    }
}
