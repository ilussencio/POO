package revisao;

import javax.swing.*;

public class Main {
    public static void violacao(){
        JOptionPane.showMessageDialog(null, "O número não pode ser negativo","RESTRICAO",1);
    }
    public static boolean par(int num){
        if(num%2 == 0)
            return true;
        else
            return false;
    }
    public static void exibeParidade(int num){
        if(par(num))
            JOptionPane.showMessageDialog(null, "o num "+num+" é par!","SAIDA",1);
        else
            JOptionPane.showMessageDialog(null, "o num "+num+" é impar!","SAIDA",1);
    }
    public static int Le(){
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        return num;
    }
    public static void main(String[] args) {
        int n = Le();
        if( n < 0){
            violacao();
        }else{
            exibeParidade(n);
        }

    }
}