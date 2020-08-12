package com.zaleski.apieadteste.apieadteste.repository;

import com.zaleski.apieadteste.apieadteste.entity.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioTurma extends JpaRepository<Turma,Integer>  {
    Turma findByName(String data_inicio);
}