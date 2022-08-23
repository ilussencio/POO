package JogadorDeFutebol;

import java.util.Scanner;

public class App {
    public static void leDados(JogadorDeFutebol jogador){
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com os dados do jogador");
        System.out.print("Nome: ");
        jogador.setNome(scan.nextLine());

        System.out.print("Data de Nascimento (dia/mes/ano): ");
        jogador.dataNascimento = scan.nextLine();

        System.out.print("Nascionalidade: ");
        jogador.nascionalidade = scan.nextLine();

        System.out.print("Posicao: ");
        jogador.posicao = scan.nextLine();

        System.out.print("Altura: ");
        jogador.altura = scan.nextDouble();

        System.out.print("Peso: ");
        jogador.peso = scan.nextDouble();
        scan.close();
    }

    public static void aposentadoria(JogadorDeFutebol jogador){
        int anos = 0;
        if( jogador.posicao.equalsIgnoreCase("atacante") && jogador.calculaIdade() < 35 )
            anos = 35 - jogador.calculaIdade();
        else if( jogador.posicao.equalsIgnoreCase("defesa") && jogador.calculaIdade() < 40 )
            anos = 40 - jogador.calculaIdade();
        else if( jogador.posicao.equalsIgnoreCase("meio de campo") && jogador.calculaIdade() < 38 )
            anos = 38 - jogador.calculaIdade();

        System.out.printf("Faltam %d ano para o jogador %s se aposentar\n",anos,jogador.getNome());

    }

    public static void main(String[] args){
        JogadorDeFutebol jogador1 = new JogadorDeFutebol();
        leDados(jogador1);

        jogador1.imprime();
        aposentadoria(jogador1);

        int idade = jogador1.calculaIdade();
        if(idade != -1)
            System.out.println("O Jogador possui "+idade+" anos");
        else
            System.out.println("Idade Invalida!");
    }
}

/*
b) Quando colocamos o atributo nome como privado ele nao pode ser acessado atraves de outras classes,
sendo necessario criar os metodos getter e setter para fazer o registro atraves de outras classes
*/