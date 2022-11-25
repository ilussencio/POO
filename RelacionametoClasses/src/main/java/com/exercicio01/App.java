package com.exercicio01;

import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Universidade universidade1 = new Universidade("Princeton (Nova Jersey - Estados Unidos da América)");
        Universidade universidade2 = new Universidade("Cambridge (Inglaterra)");


        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Albert Einsten");
        pessoa1.setUniversidade(universidade1);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Isaac Newton");
        pessoa2.setUniversidade(universidade2);

        System.out.println("Nome Pessoa: "+ pessoa1.getNome()+" | Universidade: "+pessoa1.getUniversidade().getNome());
        System.out.println("Nome Pessoa: "+ pessoa2.getNome()+" | Universidade: "+pessoa2.getUniversidade().getNome());
    }
}
