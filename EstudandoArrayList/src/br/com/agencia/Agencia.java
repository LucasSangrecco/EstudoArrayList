package br.com.agencia;

import java.util.ArrayList;
import java.util.List;

public class Agencia {

    String nome;

    //Criando uma lista de Carros do tipo Carro
    //um ArrayList de Carros
    ArrayList<Carro> listaCarros = new ArrayList<Carro>();

    //Criando um metodo sem retorno para incluir tipos de Carro
    //dentro da lista de carro

    public void adicionaCarro(Carro carro){
        listaCarros.add(carro);
    }

    //utilizando a propriedade size da classe arrayList para contar a quantidade de carros da lista

    public int getQuantidadeCarro(){
        return listaCarros.size();
    }

   public double calculaPreco(){
        double somaValor=0;
        for (int i=0; i<listaCarros.size(); i++){
            Carro c = (Carro)listaCarros.get(i);
            somaValor += c.valor;
        }
        return somaValor;
   }

}
