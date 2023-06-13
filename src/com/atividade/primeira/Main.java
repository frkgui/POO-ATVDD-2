package com.atividade.primeira;

public class Main {
    public static void main(String[] args) {

        Moto moto1 = new Moto();
        Carro carro1 = new Carro();

        moto1.marca = "Yamaha";
        moto1.modelo = "Black Velvet";
        moto1.acelerar();
        moto1.acelerar();

        carro1.marca = "Chevrolet";
        carro1.modelo = "Cobalt";
        carro1.acelerar();
        carro1.acelerar();

        System.out.println("\nInformações:\n" +
                "Veiculo: " + moto1.modelo + ", Velocidadade: " + moto1.velocidade + " KM/h\n" +
                "Veiculo: " + carro1.modelo + ", Velocidadade: " + carro1.velocidade + " KM/h"
                );
    }


}
