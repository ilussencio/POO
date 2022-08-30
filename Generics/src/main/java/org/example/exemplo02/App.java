package org.example.exemplo02;

public class App {
    public static void main(String[] args){
        ProdutosGenericos<String> p1 = new ProdutosGenericos<>("AA112","Radio",438);
        ProdutosGenericos<Integer> p2 = new ProdutosGenericos<>(1,"Radio",438);
        ProdutosGenericos<Double> p3 = new ProdutosGenericos<>(1.2,"Radio",438);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}
