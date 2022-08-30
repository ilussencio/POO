package org.example.execicio01;

public class App {
    public static void main(String[] args){
        Pessoa <Integer, Integer> p1 = new Pessoa<>("Lucas 01",123456789,1234567);
        Pessoa <Double, Double> p2 = new Pessoa<>("Lucas 02",123456789.00,1234567.33);
        Pessoa <Float, Float> p3 = new Pessoa<>("Lucas 03",(float) 123456789.00,(float)1234567);
        Pessoa <String, String> p4 = new Pessoa<>("Lucas 04","123.456.789-00","MG-12.123.123");
        Pessoa <Integer, String> p5 = new Pessoa<>("Lucas 05",123456789,"MG-12.123.123");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());

    }
}
