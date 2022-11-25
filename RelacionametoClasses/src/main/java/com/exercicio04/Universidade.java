package com.exercicio04;

import java.util.ArrayList;

public class Universidade {
    private String nome;
    private ArrayList<Departamento> departamentos;

    public Universidade(){departamentos = new ArrayList<>();}

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

    public void setDepartamentos(String nome, Universidade universidade) {
        if(departamentos.size() < 20)
            this.departamentos.add(new Departamento(nome,universidade));
        else
            System.out.println("Limite de universidades ultrapassado!");
    }
}
