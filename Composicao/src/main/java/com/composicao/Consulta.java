package com.composicao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Consulta {
    private String nomeAnimal;
    private String observacoes;
    private String queixa;
    private String historico;
    private HashSet<ItemReceita> itens;

    public Consulta(){this.itens = new HashSet<>();}

    public Consulta(String nomeAnimal, String observacoes, String queixa, String historico) {
        this.nomeAnimal = nomeAnimal;
        this.observacoes = observacoes;
        this.queixa = queixa;
        this.historico = historico;
        this.itens = new HashSet<>();
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public String getQueixa() {
        return queixa;
    }

    public String getHistorico() {
        return historico;
    }

    public HashSet<ItemReceita> getItens() {
        return itens;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public void setQueixa(String queixa) {
        this.queixa = queixa;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public void setItens(double dose, int duracao, Remedio remedio) {
        this.itens.add(new ItemReceita(dose,duracao,remedio));
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "nomeAnimal='" + nomeAnimal + '\'' +
                ", observacoes='" + observacoes + '\'' +
                ", queixa='" + queixa + '\'' +
                ", historico='" + historico + '\'' +
                ", itens=" + itens +
                '}';
    }
}
