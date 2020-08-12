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
@Table(name = "TURMAS_TBL")

public class Turma {
    @Id
    @GeneratedValue
    private int id;
    private String data_inicio;
    private boolean turma_especial;

    @Column(name = "id_cordenador")
    private int coordenador;
    @PrimaryKeyJoinColumn
    @OneToOne
    private Pessoa coord_curso;

}