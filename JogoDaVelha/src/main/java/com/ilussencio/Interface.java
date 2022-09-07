package com.ilussencio;

import javax.swing.*;
import java.util.Arrays;

public class Interface {
    private int tabuleiro[][];

    public Interface(int[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public void exibe(){
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
                        string.append("0 | ");
                }
            }
            string.append("\n");
        }
        JOptionPane.showConfirmDialog(null, string);
    }

}
