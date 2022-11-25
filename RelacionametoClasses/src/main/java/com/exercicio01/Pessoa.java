package com.exercicio01;

public class Pessoa {
    private String nome;
    private Universidade universidade;

    public Pessoa(){}

    public Pessoa(String nome, Universidade universidade) {
        this.nome = nome;
        this.universidade = universidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Universidade getUniversidade() {
        return universidade;
    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }
}
