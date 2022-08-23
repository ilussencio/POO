package JogadorDeFutebol;

import java.util.Scanner;

public class JogadorDeFutebol {
    private String nome;
    public String dataNascimento;
    public double altura;
    public double peso;
    public String nascionalidade;
    public String posicao;

    public JogadorDeFutebol(){

    }
    public JogadorDeFutebol(String nome, String dataNascimento, double altura, double peso, String nascionalidade, String posicao) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
        this.nascionalidade = nascionalidade;
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int calculaIdade(){
        String aux[] = dataNascimento.split("/");
        if(aux.length == 3)
            return (2022 - Integer.parseInt(aux[2]));
        else
            return -1;
    }

    public void imprime(){
        System.out.println("Nome: "+nome);
        System.out.println("Data de Nascimento: "+dataNascimento);
        System.out.println("Altura: "+altura);
        System.out.println("Peso: "+peso);
        System.out.println("Nacionalidade: "+nascionalidade);
        System.out.println("Posicao: "+posicao);
    }
}
