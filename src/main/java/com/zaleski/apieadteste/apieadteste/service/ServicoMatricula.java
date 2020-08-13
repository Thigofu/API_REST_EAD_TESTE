package com.zaleski.apieadteste.apieadteste.service;

import java.util.List;
import com.zaleski.apieadteste.apieadteste.entity.Matricula;
import com.zaleski.apieadteste.apieadteste.repository.RepositorioMatricula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServicoMatricula {

    @Autowired
    private RepositorioMatricula repository;
    
    public Matricula saveMatricula(Matricula matricula){
        return repository.save(matricula);
    }
    public List<Matricula> saveMatriculas(List<Matricula> matriculas){
        return repository.saveAll(matriculas);
    }

    public List<Matricula> getMatriculas(){
        return repository.findAll();
    }

    public Matricula getMatriculaById(int id){
        return repository.findById(id).orElse(null);
    }


    public String deleteMatricula(int id){
        repository.deleteById(id);
        return "matricula removido = "+id;
    }

    public Matricula updateMatricula(Matricula matricula){
        Matricula existingMatricula = repository.findById(matricula.getId()).orElse(null);
        existingMatricula.setTurmaid(matricula.getTurmaid());
        existingMatricula.setTurma(matricula.getTurma());
        existingMatricula.setAlunoid(matricula.getAlunoid());
        existingMatricula.setAluno(matricula.getAluno());
        existingMatricula.setDisciplinaid(matricula.getDisciplinaid());
        existingMatricula.setDisciplina(matricula.getDisciplina());
        existingMatricula.setCursoid(matricula.getCursoid());
        existingMatricula.setCurso(matricula.getCurso());


        return repository.save(existingMatricula);
    }
    
}