package com.atividade.terceira;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Guilherme");
        Cachorro cachorro = new Cachorro("Mallu");
        Gato gato = new Gato("Garfield");
        Vaca vaca = new Vaca("Greta");


        System.out.println("Animal: "+ animal.emitirSom());
        System.out.println("Cachorro: "+ cachorro.emitirSom());
        System.out.println("Gato: "+ gato.emitirSom());
        System.out.println("Vaca: "+ vaca.emitirSom());

    }


}
