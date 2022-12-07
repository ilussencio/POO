package com.composicao;

public class Remedio {
    private String nome;
    private String laboratorio;
    private String unidade;

    public Remedio(){}

    public Remedio(String nome, String laboratorio, String unidade) {
        this.nome = nome;
        this.laboratorio = laboratorio;
        this.unidade = unidade;
    }

    public String getNome() {
        return nome;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    @Override
    public String toString() {
        return "Remedio{" +
                "nome='" + nome + '\'' +
                ", laboratiorio='" + laboratorio + '\'' +
                ", unidade='" + unidade + '\'' +
                '}';
    }
}
