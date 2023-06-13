package com.atividade.segunda;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int valoresInt[] = {10, 20, 20};
        double valoresDouble[] = {20.00, 30.00};

        System.out.println(calc.somar(10, 40));
        System.out.println(calc.somar(20.00, 30.00));
        System.out.println(calc.somar(valoresInt));
        System.out.println(calc.somar(valoresDouble));

    }


}
