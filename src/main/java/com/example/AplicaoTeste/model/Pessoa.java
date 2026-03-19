package com.example.AplicaoTeste.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//Classes Model representam objetos utilizados pela aplicação

@Entity //Indica que Pessoa é uma entidade no Banco de Dados
public class Pessoa {

    @Id //Indica que id é a chave primária de Pessoa no Banco de Dados
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Indica a estratégia usada pelo Java para criar o id, somando de 1 em 1
    private Long id;

    //Demais atributos
    private String nome;
    private String sobrenome;
    private int idade;
    private String cpf;
    private String profissao;

    public Pessoa() {}

    public Pessoa(Long id, String nome, String sobrenome, int idade, String cpf, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.profissao = profissao;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}
