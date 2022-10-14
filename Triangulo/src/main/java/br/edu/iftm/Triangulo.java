package br.edu.iftm;

public class Triangulo {
    private double a,b,c;

    public Triangulo(){}
    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public String tipoTriangulo(){
        if(a == b && b == c) return "Equilatero";
        if(a != b && b != c && c != a) return "Escaleno";
        return "Isoceles";
    }
}
