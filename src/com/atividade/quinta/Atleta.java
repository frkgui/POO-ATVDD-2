package com.atividade.quinta;

public class Atleta extends Pessoa{
    String esporte;


    public Atleta(String nome, int idade, double altura, String esporte) {
        super(nome, idade, altura);
        this.esporte = esporte;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "esporte='" + esporte + '\'' +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}
