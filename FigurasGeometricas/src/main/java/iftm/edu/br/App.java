package iftm.edu.br;

import java.util.Scanner;

public class App {

    public static void menu(){
        Scanner scan = new Scanner(System.in);
        double lado,base,altura,xc,yc,raio;
        int opcao=0;

        while(opcao != 4) {

            System.out.println("1 - Circulo");
            System.out.println("2 - Triangulo");
            System.out.println("3 - Quadrado");
            System.out.println("4 - Sair");
            System.out.print("Digite uma opcao: ");
            opcao = scan.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("xc: ");
                    xc = scan.nextDouble();
                    System.out.print("yc: ");
                    yc = scan.nextDouble();
                    System.out.print("raio: ");
                    raio = scan.nextDouble();
                    FigurasGeometricas circulo = new FigurasGeometricas(xc,yc,raio);
                    circulo.exibeCirculo();
                    break;

                case 2:
                    System.out.print("Base: ");
                    base = scan.nextDouble();
                    System.out.print("Altura: ");
                    altura = scan.nextDouble();
                    FigurasGeometricas triangulo =  new FigurasGeometricas(base,altura);
                    triangulo.exibirTriangulo();
                    break;

                case 3:
                    System.out.print("Lado: ");
                    lado = scan.nextDouble();
                    FigurasGeometricas quadrado = new FigurasGeometricas(lado);
                    quadrado.exibirQuadrado();
                    break;
                case 4:
                    System.out.println("\nObrigado, volte sempre!");
                    break;
                default:
                    System.out.println("Entre com uma opcao valida! \n");
            }

        }
        scan.close();
    }
    public static void main(String[] args){
        menu();
    }
}
