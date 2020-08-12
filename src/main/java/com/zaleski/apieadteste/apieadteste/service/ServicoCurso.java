package com.zaleski.apieadteste.apieadteste.service;

import java.util.List;
import com.zaleski.apieadteste.apieadteste.entity.Curso;
import com.zaleski.apieadteste.apieadteste.repository.RepositorioCurso;

import org.springframework.beans.factory.annotation.Autowired;

public class ServicoCurso {
    @Autowired
    private RepositorioCurso repository;
    
    public Curso saveCurso(Curso curso){
        return repository.save(curso);
    }
    public List<Curso> saveCursos(List<Curso> cursos){
        return repository.saveAll(cursos);
    }

    public List<Curso> getCursos(){
        return repository.findAll();
    }

    public Curso getCursoById(int id){
        return repository.findById(id).orElse(null);
    }

    public Curso getCursoByName(String name){
        return repository.findByName(name);
    }

    public String deleteCurso(int id){
        repository.deleteById(id);
        return "curso removido = "+id;
    }

    public Curso updateCurso(Curso curso){
        Curso existingCurso = repository.findById(curso.getId()).orElse(null);
        existingCurso.setNome_curso(curso.getNome_curso());
        existingCurso.setDuracao(curso.getDuracao());
        existingCurso.setArea_atuacao(curso.getArea_atuacao());
        existingCurso.setEmenta(curso.getEmenta());
        existingCurso.setPortaria_mec(curso.getPortaria_mec());
        existingCurso.setValor_mensalidade(curso.getValor_mensalidade());
        existingCurso.setQtde_vagas(curso.getQtde_vagas());

        return repository.save(existingCurso);
    }
    
}