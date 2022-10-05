package com.ilussencio;

public class Elevador {
    private int andarAtual;
    private int totalDeAndares;
    private int capacidade;
    private int quantidadePessoas;

    public Elevador(){}

    public Elevador(int capacidade, int totalDeAndares){
        this.capacidade = capacidade;
        this.totalDeAndares = totalDeAndares;
        this.andarAtual = 0;
        this.quantidadePessoas = 0;
    }

    public boolean entrar(){
        //VERIFICA SE O ELEVADOR ESTA NA CAPACIDADE MAXIMA
        if(this.quantidadePessoas == this.capacidade){
            return false;
        }else{
            this.quantidadePessoas += 1;
            return true;
        }
    }

    public boolean sair(){
        if ( this.quantidadePessoas == 0){
            return false;
        }else{
            this.quantidadePessoas -= 1;
            return true;
        }
    }

    public boolean subir(){
        if(this.totalDeAndares == andarAtual){
            return false;
        }else{
            andarAtual += 1;
            return true;
        }
    }

    public boolean descer(){
        if(this.andarAtual == 0){
            return false;
        }else{
            this.andarAtual -= 1;
            return true;
        }
    }

    public String exibir(){
        StringBuilder string = new StringBuilder();
        string.append("==== ANDAR ATUAL "+this.andarAtual+"* ==== \n");
        string.append("Total de andares: "+this.totalDeAndares+"\n");
        string.append("Capacidade: "+this.capacidade+"\n");
        string.append("Possui "+this.quantidadePessoas+" Pessoas dentro do elevador!\n");
        return string.toString();
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalDeAndares() {
        return totalDeAndares;
    }

    public void setTotalDeAndares(int totalDeAndares) {
        this.totalDeAndares = totalDeAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }
}
