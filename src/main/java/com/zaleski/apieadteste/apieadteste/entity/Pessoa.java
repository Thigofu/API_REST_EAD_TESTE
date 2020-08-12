package com.zaleski.apieadteste.apieadteste.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PESSOA_TBL", uniqueConstraints={@UniqueConstraint(columnNames={"cpf","email"})})
public class Pessoa {

    @Id
    @GeneratedValue
    private int id;
    private String nome;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "email")
    private String email;
    private String data_nascimento;
    private String nome_mae;
    private String nome_pai;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String cep;
    private String complemento;
    private String senha;
    private String tipo_pessoa;
}