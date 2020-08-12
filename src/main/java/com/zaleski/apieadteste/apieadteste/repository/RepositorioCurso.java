package com.zaleski.apieadteste.apieadteste.repository;

import com.zaleski.apieadteste.apieadteste.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCurso extends JpaRepository<Curso,Integer> {
    Curso findByName(String nome_curso);
}