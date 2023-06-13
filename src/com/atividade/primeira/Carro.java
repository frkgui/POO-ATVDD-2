package com.atividade.primeira;

public class Carro extends Veiculo{
    @Override
    public void acelerar() {
        this.velocidade = this.velocidade + 20;
    }
}
