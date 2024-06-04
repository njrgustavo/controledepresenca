package com.code.controledepresnca.service;


import com.code.controledepresnca.model.Professor;
import com.code.controledepresnca.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {

    @Autowired
    ProfessorRepository professorRepository;

    public List<Professor> findAll(){
        return professorRepository.findAll();
    }

    public Optional<Professor> findById(long id){
        return professorRepository.findById(id);
    }

    public Professor save(Professor professor){
        return professorRepository.save(professor);
    }

}
