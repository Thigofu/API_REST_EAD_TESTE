package com.zaleski.apieadteste.apieadteste.controller;

import java.util.List;

import com.zaleski.apieadteste.apieadteste.entity.Pessoa;
import com.zaleski.apieadteste.apieadteste.service.ServicoPessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorPessoa {
    
    @Autowired
    private ServicoPessoa service;

    @PostMapping("/addPessoa")
    private Pessoa addPessoa(@RequestBody Pessoa pessoa){
        return service.savePessoa(pessoa);
    }

    @PostMapping("/addPessoas")
    private List<Pessoa> addPessoas(@RequestBody List<Pessoa> pessoas){
        return service.savePessoas(pessoas);
    }

    @GetMapping("/buscaPessoas")
    public List<Pessoa> findAllPessoas() {
        return service.getPessoas();
    }

    @GetMapping("/buscaPessoasById/{id}")
    public Pessoa findPessoasById(@PathVariable int id){
        return service.getPessoaById(id);
    }


    @PutMapping("/updatePessoa")
    public Pessoa updatePessoa(@RequestBody Pessoa pessoa){
        return service.updatePessoa(pessoa);
    }

    @DeleteMapping("/deletePessoa/{id}")
    public String deletePessoa(@RequestBody int id){
        return service.deletePessoa(id);
    }
}