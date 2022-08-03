package ilussencio.com;

import javax.swing.*;
import java.util.Scanner;

public class App {

    public static double le(int coef){
        Double num = Double.parseDouble(JOptionPane.showInputDialog("Digite o "+coef+"° coeficiente: "));
        return num;
    }
    public static void main(String[] args){
        double a, b, c, d,x1 , x2;
        Equacao2Grau eq1;

        a = le(1);
        b = le(2);
        c = le(3);
        eq1 = new Equacao2Grau(a,b,c);
        d = eq1.delta();

        if(d < 0){
            System.out.println("delta menor que zero! (não existem raizes reais!)");
        }else{
            x1 = eq1.calculaX1(d);
            x2 = eq1.calculaX2(d);
            eq1.exibe(x1,x2);
        }

    }
}
