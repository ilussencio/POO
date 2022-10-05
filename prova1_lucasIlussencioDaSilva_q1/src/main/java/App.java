import java.util.Scanner;

public class App {
    public static void menu(){
        System.out.println("\n=== CAIXA ELETRONICO ====");
        System.out.println("Digite uma opcao: ");
        System.out.println("1 - SACAR");
        System.out.println("2 - DEPOSITAR");
        System.out.println("3 - VISUALIZAR CONTA");
        System.out.println("4 - ENCERRAR PROGRAMA");
    }
    public static void exibir(ContaCorrente conta){
        System.out.println("=== STATUS DA CONTA CORRENTE ===");
        System.out.printf("Nome: %s\n",conta.getNome());
        System.out.printf("Conta: %s\n",conta.getNumeroConta());
        System.out.printf("Tipo de Conta: %s\n",conta.getNumeroConta());
        if(conta.getTipoConta().equals("especial")){
            System.out.printf("Limite: R$ %.2f\n",conta.getLimiteEspecial());
        }
        System.out.printf("Saldo: R$ %.2f\n",conta.getSaldo());
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int opcao;
        double valor;
        Double limiteEspecial;
        ContaCorrente conta;

        System.out.printf("Nome: ");
        String nome = scan.nextLine();

        System.out.printf("Numero da conta: ");
        String numeroConta = scan.nextLine();

        System.out.printf("Tipo da conta (comum/especial): ");
        String tipoDaConta = scan.nextLine();

        System.out.printf("Saldo: ");
        Double saldo = scan.nextDouble();

        if("comum".equals(tipoDaConta)){
            conta = new ContaCorrente(nome,numeroConta,saldo,tipoDaConta);
        }else{
            System.out.printf("Limite especial: ");
            limiteEspecial = scan.nextDouble();
            conta = new ContaCorrente(nome,numeroConta,saldo,tipoDaConta,limiteEspecial);
        }



        do{
            menu();
            System.out.printf("Opção: ");
            opcao = scan.nextInt();
            switch (opcao){
                case 1:
                    System.out.printf("Entre com o valor para SAQUE: ");
                    if(conta.getTipoConta().equals("especial")){
                        if(conta.sacar(scan.nextDouble(),conta.getLimiteEspecial()) ) {
                            System.out.println("SAQUE realizado com sucesso!");
                        }else{
                            System.out.println("Saldo insuficiente!");
                        }
                    }else{
                        if(conta.sacar(scan.nextDouble())){
                            System.out.println("SAQUE realizado com sucesso!");
                        }else{
                            System.out.println("Saldo insuficiente!");
                        }
                    }
                    break;
                case 2:
                    System.out.printf("Entre com valor para DEPOSITO: ");
                    conta.depositar(scan.nextDouble());
                    break;
                case 3:
                    exibir(conta);
                    break;
                case 4:
                    System.out.printf("Obrigado %s, volte sempre!",conta.getNome());
                    break;
                default:
                    System.out.println("Opçao Invalida!");
            }
        }while(opcao != 4);
    }
}
