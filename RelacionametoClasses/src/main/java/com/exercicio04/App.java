package com.exercicio04;

public class App {
    public static void main(String[] args){

        Universidade universidade1 = new Universidade("Princeton (Nova Jersey - Estados Unidos da América)");
        universidade1.setDepartamentos("DEPTO 01",universidade1);
        universidade1.setDepartamentos("DEPTO 01",universidade1);
        universidade1.setDepartamentos("DEPTO 01",universidade1);
        universidade1.setDepartamentos("DEPTO 01",universidade1);
        universidade1.setDepartamentos("DEPTO 01",universidade1);
        universidade1.setDepartamentos("DEPTO 01",universidade1);
        universidade1.setDepartamentos("DEPTO 01",universidade1);
        universidade1.setDepartamentos("DEPTO 01",universidade1);
        universidade1.setDepartamentos("DEPTO 01",universidade1);
        universidade1.setDepartamentos("DEPTO 01",universidade1);
        universidade1.setDepartamentos("DEPTO 01",universidade1);
        universidade1.setDepartamentos("DEPTO 01",universidade1);
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Albert Einsten");
        pessoa1.setUniversidade(universidade1);


        System.out.println("Nome Pessoa: "+ pessoa1.getNome()+" | Universidade: "+pessoa1.getUniversidade().getNome());
    }
}
