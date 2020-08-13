package com.zaleski.apieadteste.apieadteste.service;

import java.util.List;
import com.zaleski.apieadteste.apieadteste.entity.Curso;
import com.zaleski.apieadteste.apieadteste.repository.RepositorioCurso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ServicoCurso {
    @Autowired
    private RepositorioCurso repositorycurso;
    
    public Curso saveCurso(Curso curso){
        return repositorycurso.save(curso);
    }
    public List<Curso> saveCursos(List<Curso> cursos){
        return repositorycurso.saveAll(cursos);
    }

    public List<Curso> getCursos(){
        return repositorycurso.findAll();
    }

    public Curso getCursoById(int id){
        return repositorycurso.findById(id).orElse(null);
    }


    public String deleteCurso(int id){
        repositorycurso.deleteById(id);
        return "curso removido = "+id;
    }

    public Curso updateCurso(Curso curso){
        Curso existingCurso = repositorycurso.findById(curso.getId()).orElse(null);
        existingCurso.setNome_curso(curso.getNome_curso());
        existingCurso.setDuracao(curso.getDuracao());
        existingCurso.setArea_atuacao(curso.getArea_atuacao());
        existingCurso.setEmenta(curso.getEmenta());
        existingCurso.setPortaria_mec(curso.getPortaria_mec());
        existingCurso.setValor_mensalidade(curso.getValor_mensalidade());
        existingCurso.setQtde_vagas(curso.getQtde_vagas());

        return repositorycurso.save(existingCurso);
    }
    
}