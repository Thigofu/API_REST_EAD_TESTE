package com.zaleski.apieadteste.apieadteste.repository;

import com.zaleski.apieadteste.apieadteste.entity.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioDisciplina extends JpaRepository<Disciplina,Integer> {
    
}