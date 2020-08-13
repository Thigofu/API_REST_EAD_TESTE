package com.zaleski.apieadteste.apieadteste.service;

import java.util.List;
import com.zaleski.apieadteste.apieadteste.entity.Disciplina;
import com.zaleski.apieadteste.apieadteste.repository.RepositorioDisciplina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ServicoDisciplina {

    @Autowired
    private RepositorioDisciplina repository;
    
    public Disciplina saveDisciplina(Disciplina disciplina){
        return repository.save(disciplina);
    }
    public List<Disciplina> saveDisciplinas(List<Disciplina> disciplinas){
        return repository.saveAll(disciplinas);
    }

    public List<Disciplina> getDisciplinas(){
        return repository.findAll();
    }

    public Disciplina getDisciplinaById(int id){
        return repository.findById(id).orElse(null);
    }


    public String deleteDisciplina(int id){
        repository.deleteById(id);
        return "disciplina removido = "+id;
    }

    public Disciplina updateDisciplina(Disciplina disciplina){
        Disciplina existingDisciplina = repository.findById(disciplina.getId()).orElse(null);
        existingDisciplina.setNome_disciplina(disciplina.getNome_disciplina());
        existingDisciplina.setCarga_horaria(disciplina.getCarga_horaria());
        existingDisciplina.setProfessor(disciplina.getProfessor());
        existingDisciplina.setCurso(disciplina.getCurso());
        existingDisciplina.setProf(disciplina.getProf());
        existingDisciplina.setNome_curso(disciplina.getNome_curso());

        return repository.save(existingDisciplina);
    }
    
}