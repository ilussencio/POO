package org.example.exemplo01;

public class Dados <T>{
    private T num1;
    private T num2;

    public Dados(T num1, T num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public T getNum1() {
        return (T) num1;
    }

    public void setNum1(T num1) {
        this.num1 = num1;
    }

    public T getNum2() {
        return (T) num2;
    }

    public void setNum2(T num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Dados{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
