package com.exercicio04;

import com.exercicio02.Universidade;

import java.util.ArrayList;

public class Departamento {
    private String nome;
    private Universidade universidade;

    public Departamento(){}

    public Departamento(String nome, Universidade universidade) {
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
