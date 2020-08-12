package com.zaleski.apieadteste.apieadteste.service;

import java.util.List;
import com.zaleski.apieadteste.apieadteste.entity.Turma;
import com.zaleski.apieadteste.apieadteste.repository.RepositorioTurma;

import org.springframework.beans.factory.annotation.Autowired;

public class ServicoTurma {
    @Autowired
    private RepositorioTurma repository;
    
    public Turma saveTurma(Turma turma){
        return repository.save(turma);
    }
    public List<Turma> saveTurmas(List<Turma> turmas){
        return repository.saveAll(turmas);
    }

    public List<Turma> getTurmas(){
        return repository.findAll();
    }

    public Turma getTurmaById(int id){
        return repository.findById(id).orElse(null);
    }

    public Turma getTurmaByName(String name){
        return repository.findByName(name);
    }

    public String deleteTurma(int id){
        repository.deleteById(id);
        return "turma removido = "+id;
    }

    public Turma updateTurma(Turma turma){
        Turma existingTurma = repository.findById(turma.getId()).orElse(null);
        existingTurma.setData_inicio(turma.getData_inicio());
        existingTurma.setCoordenador(turma.getCoordenador());
        existingTurma.setCoord_curso(turma.getCoord_curso());
        existingTurma.setTurma_especial(turma.isTurma_especial());

        return repository.save(existingTurma);
    }
}