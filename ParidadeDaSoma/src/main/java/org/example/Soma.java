package org.example;

import javax.swing.*;

public class Soma {
    public double a, b;

    public Soma(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double somar(){
        return a+b;
    }

    public void imprimir(){
        JOptionPane.showMessageDialog(null, "A soma do numero: "+this.a+" + "+this.b+" = "+somar(),"SAIDA",1);
    }
}
