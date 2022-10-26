package br.com.agencia;

import br.com.agencia.Agencia;

public class Principal {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        carro1.nome = "Palio";
        carro1.cor = "Cinza";
        carro1.valor = 40.000;

        Carro carro2 = new Carro();
        carro2.nome = "Gol";
        carro2.cor = "Preto";
        carro2.valor = 80.000;

        Carro carro3 = new Carro();
        carro3.nome = "C3";
        carro3.cor = "Azul";
        carro3.valor = 60.000;

        Agencia agencia1 = new Agencia();
        agencia1.nome = "Feras";

        agencia1.adicionaCarro(carro1);
        agencia1.adicionaCarro(carro2);
        agencia1.adicionaCarro(carro3);

        int qtdeCarros = agencia1.getQuantidadeCarro();

        System.out.println("A lista de carros da agencia " + agencia1.nome + " possui " + qtdeCarros + " carros. \nO valor total dos carros é: " + agencia1.calculaPreco());
    }
}
