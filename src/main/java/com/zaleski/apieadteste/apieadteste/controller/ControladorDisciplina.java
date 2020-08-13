package com.zaleski.apieadteste.apieadteste.controller;

import java.util.List;

import com.zaleski.apieadteste.apieadteste.entity.Disciplina;
import com.zaleski.apieadteste.apieadteste.service.ServicoDisciplina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ControladorDisciplina {
    @Autowired
    private ServicoDisciplina service;

    @PostMapping("/addDisciplina")
    private Disciplina addDisciplina(@RequestBody Disciplina disciplina){
        return service.saveDisciplina(disciplina);
    }

    @PostMapping("/addDisciplinas")
    private List<Disciplina> addDisciplinas(@RequestBody List<Disciplina> disciplinas){
        return service.saveDisciplinas(disciplinas);
    }

    @GetMapping("/buscaDisciplinas")
    public List<Disciplina> findAllDisciplinas() {
        return service.getDisciplinas();
    }

    @GetMapping("/buscaDisciplinasById/{id}")
    public Disciplina findDisciplinasById(@PathVariable int id){
        return service.getDisciplinaById(id);
    }

    @PutMapping("/updateDisciplina")
    public Disciplina updateDisciplina(@RequestBody Disciplina disciplina){
        return service.updateDisciplina(disciplina);
    }

    @DeleteMapping("/deleteDisciplina/{id}")
    public String deleteDisciplina(@RequestBody int id){
        return service.deleteDisciplina(id);
    }
}