package ilussencio.com;

import javax.swing.*;
import java.util.Scanner;

public class Equacao2Grau {
    public double a, b, c;

    public Equacao2Grau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double delta(){
        return Math.pow(b,2) - 4 * a * c;
    }

    public double calculaX1(double d){
        return ( -b + Math.sqrt(d)) / (2*a);
    }

    public double calculaX2(double d){
        return (-b-Math.sqrt(d)) / (2*a);
    }

    public void exibe(double x1, double x2){
        System.out.println("X1: "+x1);
        System.out.println("X2: "+x2);
    }



}
