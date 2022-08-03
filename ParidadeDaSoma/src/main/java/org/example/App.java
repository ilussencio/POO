package org.example;

import javax.swing.*;

public class App {

    public static double ler(){
        double n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        return n;
    }
    public static void main(String[] args){
        double a, b, soma;
        a = ler();
        b = ler();

        Soma obj1 = new Soma(a,b);
        soma = obj1.somar();
        obj1.imprimir();

        Paridade paridade = new Paridade(soma);
        paridade.imprimir();

    }
}
