package com.zaleski.apieadteste.apieadteste.service;

import java.util.List;
import com.zaleski.apieadteste.apieadteste.entity.Pessoa;
import com.zaleski.apieadteste.apieadteste.repository.RepositorioPessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServicoPessoa {
    @Autowired
    private RepositorioPessoa repository;
    
    public Pessoa savePessoa(Pessoa pessoa){
        return repository.save(pessoa);
    }
    public List<Pessoa> savePessoas(List<Pessoa> pessoas){
        return repository.saveAll(pessoas);
    }

    public List<Pessoa> getPessoas(){
        return repository.findAll();
    }

    public Pessoa getPessoaById(int id){
        return repository.findById(id).orElse(null);
    }


    public String deletePessoa(int id){
        repository.deleteById(id);
        return "pessoa removida = "+id;
    }

    public Pessoa updatePessoa(Pessoa pessoa){
        Pessoa existingPessoa = repository.findById(pessoa.getId()).orElse(null);
        existingPessoa.setNome(pessoa.getNome());
        existingPessoa.setCpf(pessoa.getCpf());
        existingPessoa.setData_nascimento(pessoa.getData_nascimento());
        existingPessoa.setNome_mae(pessoa.getNome_mae());
        existingPessoa.setNome_pai(pessoa.getNome_pai());
        existingPessoa.setEmail(pessoa.getEmail());
        existingPessoa.setLogradouro(pessoa.getLogradouro());
        existingPessoa.setBairro(pessoa.getBairro());
        existingPessoa.setCidade(pessoa.getCidade());
        existingPessoa.setCep(pessoa.getCep());
        existingPessoa.setComplemento(pessoa.getComplemento());
        existingPessoa.setTipo_pessoa(pessoa.getTipo_pessoa());
        existingPessoa.setSenha(pessoa.getSenha());
        
        return repository.save(existingPessoa);
    }
}