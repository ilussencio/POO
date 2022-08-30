package org.example.exemplo01;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){
        List<Dados> dados = new ArrayList<Dados>();

        dados.add(new Dados(2,3));
        dados.add(new Dados(5.1,5));
        //System.out.println(dados);

        Dados d1 = new Dados(10,3);
        System.out.println(d1.toString());
        AdicaoTiposGenericos<Integer> ad1 = new AdicaoTiposGenericos<>();
        int somaInt = ad1.add((int)d1.getNum1(),(int)d1.getNum2());
        ad1.exibe((int)d1.getNum1(), (int)d1.getNum2(),somaInt);

        Dados d2 = new Dados((float)10.3,(float)3.3);
        AdicaoTiposGenericos<Float> ad2 = new AdicaoTiposGenericos<>();
        float somaFloat = ad2.add((float) d2.getNum1(), (float) d2.getNum2());
        ad2.exibe((float)d2.getNum1(),(float)d2.getNum2(), somaFloat);


    }
}
