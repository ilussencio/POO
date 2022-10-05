package com.ilussencio;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class App {
    public static int menu(){
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opcão\n(1) Subir\n(2) Descer\n(3) Entrar\n(4) Sair\n(5) Exibir\n(6) Fechar programa"));
        return opcao;
    }
    public static void main(String[] args){
        int capacidade = Integer.parseInt(JOptionPane.showInputDialog("Entre com a capacidade de PESSOAS do elevador:"));
        int totalDeAndares = Integer.parseInt(JOptionPane.showInputDialog("Entre com o total de ANDARES do predio:"));
        Elevador elevador = new Elevador(capacidade,totalDeAndares);
        int opcao = 0;
        do{
            opcao = menu();
            switch (opcao){
                case 1:
                    if( elevador.subir() == true ){
                        JOptionPane.showMessageDialog(new JFrame(),"SUBINDO!","ALERT",JOptionPane.WARNING_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(new JFrame(),"JA ESTAMOS NO ULTIMO ANDAR!","ALERT",JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case 2:
                    if(elevador.descer() == true){
                        JOptionPane.showMessageDialog(new JFrame(),"DESCENDO!","ALERT",JOptionPane.WARNING_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(new JFrame(),"JA ESTAMOS NO TERREO!","ALERT",JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case 3:
                    if(elevador.entrar() == false){
                        JOptionPane.showMessageDialog(new JFrame(),"LOTACAO MAXIMA ATINGIDA!","ALERT",JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case 4:
                    if(elevador.sair() == false){
                        JOptionPane.showMessageDialog(new JFrame(),"NAO POSSUI NINGUEM NO ELEVADOR!","ALERT",JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case 5:
                    JOptionPane.showMessageDialog(new JFrame(),elevador.exibir(),"ALERT",JOptionPane.WARNING_MESSAGE);
                    break;
                case 6:
                    break;
                default:
                    JOptionPane.showMessageDialog(new JFrame(),"OPCAO INVALIDA!","ALERT",JOptionPane.WARNING_MESSAGE);
            }
        }while (opcao != 6);
    }
}
