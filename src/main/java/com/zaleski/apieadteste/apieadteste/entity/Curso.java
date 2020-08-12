package com.zaleski.apieadteste.apieadteste.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CURSOS_TBL")

public class Curso {
    @Id
    @GeneratedValue
    private int id;
    private String nome_curso;
    private String duracao;
    private String area_atuacao;
    private String portaria_mec;
    private String ementa;
    private double valor_mensalidade;
    private int qtde_vagas;
}