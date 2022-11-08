package org.example;

import java.util.Scanner;

public class Main {
    public static void sacar(Double valor) throws IllegalAccessException {
        if(valor > 400)
            throw  new IllegalAccessException();
        else
            System.out.println("Valor "+valor+" sacado!");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double valor = scan.nextDouble();

        try{
            sacar(valor);
        }catch (IllegalAccessException e){
            System.out.println("SAQUE INVALIDO!");
        }
        
    }
}