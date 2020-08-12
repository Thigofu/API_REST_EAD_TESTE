package com.zaleski.apieadteste.apieadteste.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MATRICULA_TBL")

public class Matricula {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "id_turma")
    private int turmaid;
    @PrimaryKeyJoinColumn
    @OneToOne
    private Turma turma;

    @Column(name = "id_aluno")
    private int alunoid;
    @PrimaryKeyJoinColumn
    @OneToOne
    private Pessoa aluno;

    @Column(name = "id_disciplina")
    private int disciplinaid;
    @PrimaryKeyJoinColumn
    @OneToOne
    private Disciplina disciplina;

    @Column(name = "id_curso")
    private int cursoid;
    @PrimaryKeyJoinColumn
    @OneToOne
    private Curso curso;
    
	public Matricula orElse(Object object) {
		return null;
	}
}