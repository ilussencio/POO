package org.example;

import javax.swing.*;

public class Paridade {
    public double num;

    public Paridade(double num){
        this.num = num;
    }
    public boolean verificacao(){
        if(this.num < 0)
            return false;
        else
            return true;
    }
    public boolean calcParidade(){

        if(this.num % 2 == 0)
            return true;
        else
            return false;
    }

    public void imprimir() {
        if (!verificacao()) {
            JOptionPane.showMessageDialog(null, "O Numero é " + this.num + " é negativo!", "SAIDA", 1);
        } else if (calcParidade()) {
            JOptionPane.showMessageDialog(null, "O Numero é " + this.num + " é par!", "SAIDA", 1);
        } else {
            JOptionPane.showMessageDialog(null, "O Numero é " + this.num + " é impar!", "SAIDA", 1);
        }
    }
}
