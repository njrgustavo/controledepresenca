package com.code.controledepresnca.repository;

import com.code.controledepresnca.model.Aula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AulaRepository extends JpaRepository<Aula,Long> {
}
