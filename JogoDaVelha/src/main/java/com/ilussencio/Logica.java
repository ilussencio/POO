package com.ilussencio;

import javax.swing.*;

public class Logica {
    private int tabuleiro[][] = new int[3][3];
    private int pos[];
    private int jogador;

    //CONTRUTOR
    public Logica() {
    }

    public Logica(int[][] tabuleiro, int[] pos, int jogador) {
        this.tabuleiro = tabuleiro;
        this.pos = pos;
        this.jogador = jogador;
    }

    //GETTER E SETER
    public int[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(int[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public int getJogador() {
        return jogador;
    }

    //METODOS
    //REGISTRA JOGADA
    public boolean jogada(int pos[], int jogador) {
        this.jogador = jogador;
        this.pos = pos;
        if (ocupacao()) {
            this.tabuleiro[pos[0]][pos[1]] = jogador;
            return true;
        } else {
            return false;
        }
    }

    public boolean ocupacao() {
        return (tabuleiro[pos[0]][pos[1]] == 0) ? true : false;
    }

    public boolean velha(){
        for(int i =0; i < 3; i ++){
            for(int j = 0; j < 3; j ++){
                if(tabuleiro[i][j] == 0)
                    return false;
            }
        }

        if(vitoria()) return false;

        return true;
    }
    public boolean vitoria() {
        //VALIDA VERTICAL
        for (int i = 0; i < 3; i++) {
            if ( tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador)
                return true;
        }

        //VALIDA HORIZONTAL
        for (int i = 0; i < 3; i++) {
            if ( tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador )
                return true;
        }

        //VALIDA DIAGONAL PRINCIPAL
        if( tabuleiro[0][0] == jogador &&  tabuleiro[1][1] == jogador  && tabuleiro[2][2] == jogador ){
            return true;
        }

        //VALIDA DIAGONAL SECUNDARIA
        if(tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador){
            return  true;
        }

        return false;
    }

    public String viewTabuleiro(){
        StringBuilder string = new StringBuilder();
        for(int i = 0; i < 3; i ++){
            for(int j = 0; j < 3; j ++){
                switch (tabuleiro[i][j]){
                    case 1:
                        string.append("X | ");
                        break;
                    case 2:
                        string.append("O | ");
                        break;
                    default:
                        string.append("v | ");
                }
            }
            string.append("\n");
        }
        //JOptionPane.showConfirmDialog(null, string);
        return string.toString();
    }
}
