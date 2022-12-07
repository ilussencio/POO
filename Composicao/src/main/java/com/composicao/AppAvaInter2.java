package com.composicao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AppAvaInter2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();
        map.put("ml","mililitro");
        map.put("cp","comprimido");
        map.put("gr","grama");
        map.put("un","unidade");

        ArrayList<Remedio> remedios = new ArrayList<>();

        System.out.println("REMEDIO:");
        while (true){
            try {
                Remedio rm = new Remedio();
                System.out.print("Entre com o nome: ");
                rm.setNome(scan.nextLine());
                System.out.print("Entre com o laboratorio: ");
                rm.setLaboratorio(scan.nextLine());
                System.out.print("Entre com o unidade: ");
                rm.setUnidade(scan.nextLine());

                if (rm.getUnidade().length() != 2 || !map.containsKey(rm.getUnidade())) {
                    throw new IllegalArgumentException();
                }
                remedios.add(rm);
                System.out.print("Deseja cadastrar um novo remedio (S/n): ");
                if (scan.nextLine().equalsIgnoreCase("n"))
                    break;
            }catch (IllegalArgumentException e){
                System.out.println("ERROR: Unidade invalida, por favor cadastre um novo remedio!");
            }
        }
        System.out.println("\nCONSULTA:");
        Consulta consulta = new Consulta();
        System.out.print("Nome do animal: ");
        consulta.setNomeAnimal(scan.nextLine());
        System.out.print("Observacoes: ");
        consulta.setObservacoes(scan.nextLine());
        System.out.print("Queixa: ");
        consulta.setQueixa(scan.nextLine());
        System.out.print("Historico: ");
        consulta.setHistorico(scan.nextLine());
        System.out.println("\tREMEDIOS PARA O "+ consulta.getNomeAnimal());
        while (true) {
            for (int i = 0; i < remedios.size(); i++) {
                System.out.printf("\t(%d) : %s - %s\n", i, remedios.get(i).getNome(), remedios.get(i).getLaboratorio());
            }
            System.out.print("Inserir remedio: ");
            int rm = scan.nextInt();
            System.out.println(remedios.get(rm));
            System.out.print("Dose: ");
            Double dose = scan.nextDouble();
            System.out.print("Duracao: ");
            int duracao = scan.nextInt();

            consulta.setItens(dose, duracao,remedios.get(rm));

            System.out.print("Deseja inserir mais um remedio? (S/n)");
            scan.nextLine();
            if(scan.nextLine().equalsIgnoreCase("n"))
                break;
        }
        System.out.println("\n\n\t == CONSULTA == ");
        System.out.println("Paciente Animal : "+ consulta.getNomeAnimal());
        System.out.println("Observacoes : "+ consulta.getObservacoes());
        System.out.println("Queixa: "+consulta.getQueixa());
        System.out.print("Historico: "+consulta.getHistorico());
        System.out.println("\n\t ** MEDICAMENTOS **");
        for(ItemReceita item : consulta.getItens()){
            System.out.printf("%s - %s - %.2f %s - %d dias \n",
                    item.getRemedio().getNome(),
                    item.getRemedio().getLaboratorio(),
                    item.getDose(),
                    map.get(item.getRemedio().getUnidade()),
                    item.getDuracao());
        }
        scan.close();
    }
}


