package com.atividade.quinta;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Guilherme", 19,1.74);
        Pessoa outraPessoa = new Pessoa("Thiago Veigh",23,1.80);

        Atleta atleta = new Atleta("Neymar", 31, 1.75, "Futebol");

        System.out.println(pessoa.toString());
        System.out.println(outraPessoa.toString());

        System.out.println("----------------");

        System.out.println(atleta.toString());


    }
}
