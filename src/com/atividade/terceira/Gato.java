package com.atividade.terceira;

public class Gato extends Animal{
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public String emitirSom() {
        return "Miado";
    }
}
