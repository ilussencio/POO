package br.edu.iftm;

import java.util.Scanner;

public class App {
    public static double[] le(){
        Scanner scan = new Scanner(System.in);
        double[] vet = new double[3];
        System.out.printf("a: ");
        vet[0] = scan.nextDouble();
        System.out.printf("b: ");
        vet[1] = scan.nextDouble();
        System.out.printf("c: ");
        vet[2] = scan.nextDouble();
        scan.close();
        return vet;
    }
    public static void exibe(Triangulo triangulo){
        System.out.println("Triângulo "+triangulo.tipoTriangulo());
    }

    public static void main(String[] args){
        double[] vet = le();
        Triangulo triangulo = new Triangulo(vet[0],vet[1],vet[2]);
        if ( ValidaTriangulo.verifica(triangulo) )
            exibe(triangulo);
        else
            System.out.println("Não é um triângulo!");
    }
}
