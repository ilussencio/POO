package iftm.edu.br;

public class FigurasGeometricas {
    //VARIAVEIS
    private double lado;
    private double base;
    private double altura;
    private double xc;
    private double yc;
    private double raio;

    //CONSTRUTORES
    public FigurasGeometricas(double lado) {
        this.lado = lado;
    }

    public FigurasGeometricas(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public FigurasGeometricas(double xc, double yc, double raio){
        this.xc = xc;
        this.yc = yc;
        this.raio = raio;
    }

    //METODOS
    public double areaQuadrado(){
        return lado * lado;
    }

    public double areaTriangulo(){
        return (base*altura)/2;
    }

    public double areaCirculo(){
        return 3.14*(raio*raio);
    }

    public void exibirQuadrado(){
        System.out.println("==== QUADRADO ====");
        System.out.println("Lado = "+lado);
        System.out.println("Area do quadrado = "+areaQuadrado());
        System.out.println();
    }

    public void exibirTriangulo(){
        System.out.println("==== TRIANGULO ====");
        System.out.println("base = "+base);
        System.out.println("altura = "+altura);
        System.out.println("Area do triangulo = "+areaTriangulo());
        System.out.println();
    }

    public void exibeCirculo(){
        System.out.println("==== CIRCULO ====");
        System.out.println("xc = "+xc);
        System.out.println("yc = "+yc);
        System.out.println("raio = "+raio);
        System.out.println("Area do triangulo = "+areaCirculo());
        System.out.println();

    }

}
