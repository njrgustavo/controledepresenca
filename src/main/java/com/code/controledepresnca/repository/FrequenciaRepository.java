package com.code.controledepresnca.repository;

import com.code.controledepresnca.model.Frequencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrequenciaRepository extends JpaRepository<Frequencia,Long> {
}
