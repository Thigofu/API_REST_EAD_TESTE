package com.zaleski.apieadteste.apieadteste.repository;

import com.zaleski.apieadteste.apieadteste.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioMatricula extends JpaRepository<Matricula,Integer> {
    Matricula findById(int id);
}