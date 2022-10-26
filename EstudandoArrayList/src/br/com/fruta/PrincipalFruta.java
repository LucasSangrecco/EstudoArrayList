package br.com.fruta;

public class PrincipalFruta {
    public static void main(String[] args) {

        Fruta fruta1 = new Fruta();
        fruta1.nome = "Uva";
        fruta1.valor = 6.99;

        Fruta fruta2 = new Fruta();
        fruta2.nome = "Melancia";
        fruta2.valor = 4.99;

        Fruta fruta3 = new Fruta();
        fruta3.nome = "Banana";
        fruta3.valor = 2.99;

        Sacolao sacolao1 = new Sacolao();
        sacolao1.nome = "XYZ";

        sacolao1.adicionaFruta(fruta1);
        sacolao1.adicionaFruta(fruta2);
        sacolao1.adicionaFruta(fruta3);

        System.out.printf("A lista do sacolão %s possui %d frutas.\nO valor total é: %.2f", sacolao1.nome, sacolao1.getQuantidadeFruta(), sacolao1.calcularPreco());
    }
}
