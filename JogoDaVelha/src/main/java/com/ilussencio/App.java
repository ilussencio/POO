package com.ilussencio;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static int[] le(Logica tabuleiro){


        int vet[] = new int[2];
        int valor = Integer.parseInt(JOptionPane.showInputDialog(tabuleiro.viewTabuleiro()+"Entre com um valor (1-9): "));

        switch (valor){
            case 1:
                vet[0] = 0;
                vet[1] = 0;
                break;
            case 2:
                vet[0] = 0;
                vet[1] = 1;
                break;
            case 3:
                vet[0] = 0;
                vet[1] = 2;
                break;
            case 4:
                vet[0] = 1;
                vet[1] = 0;
                break;
            case 5:
                vet[0] = 1;
                vet[1] = 1;
                break;
            case 6:
                vet[0] = 1;
                vet[1] = 2;
                break;
            case 7:
                vet[0] = 2;
                vet[1] = 0;
                break;
            case 8:
                vet[0] = 2;
                vet[1] = 1;
                break;
            case 9:
                vet[0] = 2;
                vet[1] = 2;
                break;
        }
        return vet;
    }
    public static int[] jogaComputador(int tabuleiro[][]){
        int vet[] = new int[2];
        if(tabuleiro[1][1] != 1 && tabuleiro[1][1] != 2){
            vet[0] = 1;
            vet[1] = 1;
            return vet;
        }

        List arrayI = new ArrayList<>();
        List arrayJ = new ArrayList<>();

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3;j++){
                if(tabuleiro[i][j] != 1 && tabuleiro[i][j] != 2){
                    arrayI.add(i);
                    arrayJ.add(j);
                }
            }
        }

        int jogada = (int) (Math.random() * arrayI.size()) + 0;
        vet[0] = (int) arrayI.get(jogada);
        vet[1] = (int) arrayJ.get(jogada);
        return vet;
    }
    public static void main(String[] args){
        Logica tabuleiro = new Logica();
        boolean aux;

        while(true){
            do{
                aux = tabuleiro.jogada(le(tabuleiro), 1);
                if(tabuleiro.velha()){
                    JOptionPane.showMessageDialog(null, tabuleiro.viewTabuleiro()+"\n Deu velha!");
                    return;
                } else if (tabuleiro.vitoria()){
                    JOptionPane.showMessageDialog(null, tabuleiro.viewTabuleiro()+"\nJogador "+tabuleiro.getJogador()+" Venceu!" );
                    return;
                }
            }while(! aux);

            do{
                aux = tabuleiro.jogada(jogaComputador(tabuleiro.getTabuleiro()),2);
                if(tabuleiro.velha()){
                    JOptionPane.showMessageDialog(null, tabuleiro.viewTabuleiro()+"\n Deu velha!");
                    return;
                } else if (tabuleiro.vitoria()){
                    JOptionPane.showMessageDialog(null, tabuleiro.viewTabuleiro()+"\nJogador "+tabuleiro.getJogador()+" Venceu!" );
                    return;
                }
            } while(! aux);
        }
    }
}
