package com.code.controledepresnca.service;


import com.code.controledepresnca.model.Frequencia;
import com.code.controledepresnca.repository.FrequenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FrequenciaService {

    @Autowired
    FrequenciaRepository frequenciaRepository;

    public List<Frequencia> findAll(){
        return frequenciaRepository.findAll();
    }

    public Optional<Frequencia> findById(long id){
        return frequenciaRepository.findById(id);
    }

    public Frequencia save(Frequencia frequencia){
        return frequenciaRepository.save(frequencia);
    }

}
