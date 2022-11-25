package com.exercicio03;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {
    public static void main(String[] args){

        Universidade universidade1 = new Universidade("Princeton (Nova Jersey - Estados Unidos da América)");
        Universidade universidade2 = new Universidade("Cambridge (Inglaterra)");

        universidade1.setDepartamentos("DEPARTAMENTO 01");
        universidade1.setDepartamentos("DEPARTAMENTO 02");

        universidade2.setDepartamentos("DEPARTAMENTO 02");
        universidade2.setDepartamentos("DEPARTAMENTO 02");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Albert Einsten");
        pessoa1.setUniversidade(universidade1);
        pessoa1.setDepartamento(universidade1.getDepartamentos().get(0));

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Isaac Newton");
        pessoa2.setUniversidade(universidade2);
        pessoa2.setDepartamento(universidade2.getDepartamentos().get(1));

        System.out.println("Nome Pessoa: "+ pessoa1.getNome()+" | Universidade: "+pessoa1.getUniversidade().getNome());
        System.out.println("Nome Pessoa: "+ pessoa2.getNome()+" | Universidade: "+pessoa2.getUniversidade().getNome());
    }
}
