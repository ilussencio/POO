package br.edu.iftm;

public class ValidaTriangulo {
    public static boolean verifica(Triangulo triangulo){
        double a = triangulo.getA();
        double b = triangulo.getB();
        double c = triangulo.getC();

        if( (a+b) > c && (a+c) > b && (b+c) > a){
            return true;
        }
        return false;
    }
}
