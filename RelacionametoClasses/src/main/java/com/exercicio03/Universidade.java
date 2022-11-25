package com.exercicio03;

import java.util.ArrayList;

public class Universidade {
    private String nome;
    private ArrayList<Departamento> departamentos;

    public Universidade(){
        this.departamentos = new ArrayList<>();
    }

    public Universidade(String nome) {
        this.nome = nome;
        this.departamentos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(String nome) {
        this.departamentos.add(new Departamento(nome));
    }
}
