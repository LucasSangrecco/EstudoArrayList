package br.com.moto;

public class PrincipalMoto {
    public static void main(String[] args) {

        Moto moto1 = new Moto();
        moto1.nome = "CG";
        moto1.cor = "Vermelha";
        moto1.valor = 20.000;

        Moto moto2 = new Moto();
        moto2.nome = "Tyger";
        moto2.cor = "Cinza";
        moto2.valor = 30.000;

        Agencia agencia1 = new Agencia();
        agencia1.nome = "asdf";

        agencia1.adicionaMoto(moto1);
        agencia1.adicionaMoto(moto2);

        System.out.println("A lista da agencia " + agencia1.nome + " possui " + agencia1.getQuantidadeMoto() + " motos. \n O valor total das motos é: " + agencia1.calculaPreco());
    }
}
