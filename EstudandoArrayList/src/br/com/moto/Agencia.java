package br.com.moto;

import java.util.ArrayList;

public class Agencia {

    String nome;

    ArrayList<Moto> listaMoto = new ArrayList<Moto>();

    public void adicionaMoto(Moto moto){
        listaMoto.add(moto);
    }
    public int getQuantidadeMoto(){
        return listaMoto.size();
    }
    public double calculaPreco(){
        double somaValor=0;
        for(int i=0; i<listaMoto.size();i++){
            Moto m = (Moto)listaMoto.get(i);
            somaValor += m.valor;
        }
        return somaValor;
    }

}
