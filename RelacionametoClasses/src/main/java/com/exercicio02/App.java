package com.exercicio02;

public class App {
    public static void main(String[] args){

        Universidade universidade1 = new Universidade("Princeton (Nova Jersey - Estados Unidos da América)","DEPARTAMENTO 01");
        Universidade universidade2 = new Universidade("Cambridge (Inglaterra)","DEPARTAMENTO 01");

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Albert Einsten");
        pessoa1.setUniversidade(universidade1);
        pessoa1.setDepartamento(universidade1.getDepartamento());

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Isaac Newton");
        pessoa2.setUniversidade(universidade2);
        pessoa2.setDepartamento(universidade2.getDepartamento());

        System.out.println("Nome Pessoa: "+ pessoa1.getNome()+" | Universidade: "+pessoa1.getUniversidade().getNome()+" | Departamento: "+pessoa1.getDepartamento().getNome());
        System.out.println("Nome Pessoa: "+ pessoa2.getNome()+" | Universidade: "+pessoa2.getUniversidade().getNome()+"| Departamento: "+pessoa2.getDepartamento().getNome());
    }
}
