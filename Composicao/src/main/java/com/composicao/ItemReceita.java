package com.composicao;

public class ItemReceita {
    private double dose;
    private int duracao;
    private Remedio remedio;

    public ItemReceita(){}
    public ItemReceita(double dose, int duracao, Remedio remedio) {
        this.dose = dose;
        this.duracao = duracao;
        this.remedio = remedio;
    }

    public double getDose() {
        return dose;
    }

    public int getDuracao() {
        return duracao;
    }

    public Remedio getRemedio() {
        return remedio;
    }

    public void setDose(double dose) {
        this.dose = dose;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setRemedio(Remedio remedio) {
        this.remedio = remedio;
    }

    @Override
    public String toString() {
        return "ItemReceita{" +
                "dose=" + dose +
                ", duracao=" + duracao +
                ", remedio=" + remedio +
                '}';
    }
}
