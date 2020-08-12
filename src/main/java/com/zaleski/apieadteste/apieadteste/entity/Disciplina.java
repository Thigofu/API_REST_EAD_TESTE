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
@Table(name = "DISCIPLINAS_TBL")

public class Disciplina {
    @Id
    @GeneratedValue
    private int id;
    private String nome_disciplina;
    private String carga_horaria;
    
    @Column(name = "id_professor")
    private int professor;
    @PrimaryKeyJoinColumn
    @OneToOne
    private Pessoa prof;

    @Column(name = "id_curso")
    private int curso;
    @PrimaryKeyJoinColumn
    @OneToOne
    private Curso nome_curso;

}