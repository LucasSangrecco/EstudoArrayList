package br.com.fruta;

import java.util.ArrayList;

public class Sacolao {

    String nome;

    ArrayList<Fruta> listaFrutas = new ArrayList<Fruta>();

    public void adicionaFruta(Fruta fruta){
        listaFrutas.add(fruta);
    }
    public int getQuantidadeFruta(){
        return listaFrutas.size();
    }
    public double calcularPreco(){
        double valorTotal=0;
        for (Fruta fruta : listaFrutas) {
           valorTotal += fruta.getValor();
        }
        return valorTotal;
    }

}
