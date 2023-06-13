package com.atividade.terceira;

public class Cachorro extends Animal{
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public String emitirSom() {
        return "Latido";
    }
}
