package org.example.exercicio02;

public class App {
    public static void executa(int num, int den){
        try{
            if(num % 2 != 0)
                throw new DvisaoNaoExata(num,den);
            System.out.println(num + "/" + den + "=" + (num/den));
        }
        catch(DvisaoNaoExata ex){
            System.out.println(ex.toString());
        }
    }

    public static void main(String[] args){
        int [] num = {4,8,5,16,32,21,64,128,62,80, 90};
        int [] den = {2,0,4,8,0,2,4};
        for(int i=0; i<num.length; i++){
            try{
                executa(num[i],den[i]);
            }catch(ArithmeticException | ArrayIndexOutOfBoundsException  e){
                System.out.println("Error: "+e.getMessage());
            }
        }
    }
}
