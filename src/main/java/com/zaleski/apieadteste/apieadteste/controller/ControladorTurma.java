package com.zaleski.apieadteste.apieadteste.controller;

import java.util.List;

import com.zaleski.apieadteste.apieadteste.entity.Turma;
import com.zaleski.apieadteste.apieadteste.service.ServicoTurma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ControladorTurma {
    
    @Autowired
    private ServicoTurma service;

    @PostMapping("/addTurma")
    private Turma addTurma(@RequestBody Turma turma){
        return service.saveTurma(turma);
    }

    @PostMapping("/addTurmas")
    private List<Turma> addTurmas(@RequestBody List<Turma> turmas){
        return service.saveTurmas(turmas);
    }

    @GetMapping("/buscaTurmas")
    public List<Turma> findAllTurmas() {
        return service.getTurmas();
    }

    @GetMapping("/buscaTurmasById/{id}")
    public Turma findTurmasById(@PathVariable int id){
        return service.getTurmaById(id);
    }

    @GetMapping("/buscaTurmas/{name}")
    public Turma findturmaById(@PathVariable String nome){
        return service.getTurmaByName(nome);
    }

    @PutMapping("/updateTurma")
    public Turma updateTurma(@RequestBody Turma turma){
        return service.updateTurma(turma);
    }

    @DeleteMapping("/deleteTurma/{id}")
    public String deleteTurma(@RequestBody int id){
        return service.deleteTurma(id);
    }
}