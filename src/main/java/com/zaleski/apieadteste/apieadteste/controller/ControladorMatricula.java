package com.zaleski.apieadteste.apieadteste.controller;

import java.util.List;

import com.zaleski.apieadteste.apieadteste.entity.Matricula;
import com.zaleski.apieadteste.apieadteste.service.ServicoMatricula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ControladorMatricula {
    @Autowired
    private ServicoMatricula service;

    @PostMapping("/addMatricula")
    private Matricula addMatricula(@RequestBody Matricula matricula){
        return service.saveMatricula(matricula);
    }

    @PostMapping("/addMatriculas")
    private List<Matricula> addMatriculas(@RequestBody List<Matricula> matriculas){
        return service.saveMatriculas(matriculas);
    }

    @GetMapping("/buscaMatriculas")
    public List<Matricula> findAllMatriculas() {
        return service.getMatriculas();
    }

    @GetMapping("/buscaMatriculasById/{id}")
    public Matricula findMatriculasById(@PathVariable int id){
        return service.getMatriculaById(id);
    }


    @PutMapping("/updateMatricula")
    public Matricula updateMatricula(@RequestBody Matricula matricula){
        return service.updateMatricula(matricula);
    }

    @DeleteMapping("/deleteMatricula/{id}")
    public String deleteMatricula(@RequestBody int id){
        return service.deleteMatricula(id);
    }
    
    
}