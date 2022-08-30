package org.example.exemplo01;

public class AdicaoTiposGenericos <T> {
    public T add(T num1,T num2){
        if(num1 instanceof  Integer && num2 instanceof Integer){
            return (T) (Integer) ((Integer)num1 + (Integer) num2);
        }else{
            return (T) (Float) ((Float)num1 +(Float)num2);
        }
    }

    public void exibe(T num1, T num2, T soma){
        System.out.println("A soma de "+num1+" e "+num2+" = "+soma);
    }
}
