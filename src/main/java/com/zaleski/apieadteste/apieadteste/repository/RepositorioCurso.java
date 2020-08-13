package com.zaleski.apieadteste.apieadteste.repository;

import com.zaleski.apieadteste.apieadteste.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface RepositorioCurso extends JpaRepository<Curso,Integer> {
}