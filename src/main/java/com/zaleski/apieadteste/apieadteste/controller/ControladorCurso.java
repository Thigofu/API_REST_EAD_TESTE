package com.zaleski.apieadteste.apieadteste.controller;

import java.util.List;

import com.zaleski.apieadteste.apieadteste.entity.Curso;
import com.zaleski.apieadteste.apieadteste.service.ServicoCurso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorCurso {

    @Autowired
    private ServicoCurso servicocurso;

    @PostMapping("/addCurso")
    private Curso addCurso(@RequestBody Curso curso){
        return servicocurso.saveCurso(curso);
    }

    @PostMapping("/addCursos")
    private List<Curso> addCursos(@RequestBody List<Curso> cursos){
        return servicocurso.saveCursos(cursos);
    }

    @GetMapping("/buscaCursos")
    public List<Curso> findAllCursos() {
        return servicocurso.getCursos();
    }

    @GetMapping("/buscaCursosById/{id}")
    public Curso findCursosById(@PathVariable int id){
        return servicocurso.getCursoById(id);
    }


    @PutMapping("/updateCurso")
    public Curso updateCurso(@RequestBody Curso curso){
        return servicocurso.updateCurso(curso);
    }

    @DeleteMapping("/deleteCurso/{id}")
    public String deleteCurso(@RequestBody int id){
        return servicocurso.deleteCurso(id);
    }
    
}