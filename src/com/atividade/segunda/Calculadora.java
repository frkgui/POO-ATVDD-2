package com.atividade.segunda;

public class Calculadora {
    public int somar(int valor1, int valor2){
        return valor1 + valor2 ;
    }

    public double somar(double valor1, double valor2){
        return valor1 + valor2;
    }

    public int somar(int[] valores){

        int total = 0;

        for (int aux=0; aux< valores.length;aux++){
            total+=valores[aux];
        }
        return total;
    }

    public double somar(double[] valores){

        double total = 0;

        for (int aux=0; aux< valores.length;aux++){
            total+=valores[aux];
        }
        return total;
    }

}
