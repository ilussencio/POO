package com.exercicio02;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Universidade {
    private String nome;
    private Departamento departamento;

    public Universidade(){
    }

    public Universidade(String nome, String nomeDepartamento) {
        this.nome = nome;
        this.departamento = new Departamento(nomeDepartamento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String nome) {
        this.departamento = new Departamento(nome);
    }
}
