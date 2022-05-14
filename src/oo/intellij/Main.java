package oo.intellij;

import java.util.ArrayList;

public class Main {

    //Autor: Gustavo Serra
    public static void main(String[] args) {

        Lanche l1 = new Lanche("NecFeijoada", "Lanche de feijoada", 12.5f);
        Lanche l2 = new Lanche("NecBacon", "Lanche de bacon", 13.5f);
        Lanche l3 = new Lanche("NecAcarajé", "Lanche de acarajé", 14.5f);
        Lanche l4 = new Lanche("NecPicanha", "Lanche de picanha", 15.5f);

        CardapioPais br = new CardapioPais("Brasil");
        br.adicionarLanche(l1);
        br.adicionarLanche(l2);
        br.adicionarLanche(l3);
        br.adicionarLanche(l4);

        Lanche l5 = new Lanche("NecChimichurri", "Lanche de chimichurri", 16.5f);

        CardapioPais ar = new CardapioPais("Argentina");
        ar.adicionarLanche(l4);
        ar.adicionarLanche(l5);

        Lanche l6 = new Lanche("NecCheddar", "Lanche de cheddar", 16.5f);

        CardapioPais eua = new CardapioPais("EUA");
        eua.adicionarLanche(l2);
        eua.adicionarLanche(l6);

        CardapioPais jp = new CardapioPais("Japão");
        jp.adcionarLanche("NecSushi", "Lanche de sushi", 17.5f);
        jp.adicionarLanche(l6);

        Restaurante r1 = new Restaurante("Brasil 1", "Rua Laranjeiras, 15", br);
        Restaurante r2 = new Restaurante("Brasil 2", "Rua Mangueiras, 20", br);
        Restaurante r3 = new Restaurante("EUA 1", "Street Eleven, 25", eua);
        Restaurante r4 = new Restaurante("Japão 1", "Rua niso, 30", jp);

        RedeRestaurantes rr = new RedeRestaurantes("Nec-Nec");
        rr.adicionarRestaurante(r1);
        rr.adicionarRestaurante(r2);
        rr.adicionarRestaurante(r3);
        rr.adicionarRestaurante(r4);

        rr.adicionarCardapio(br);
        rr.adicionarCardapio(ar);
        rr.adicionarCardapio(eua);
        rr.adicionarCardapio(jp);

        mostrarCardapio(br);
        mostrarCardapiosPaises(rr);

        br.removerLanche(l2);
        mostrarCardapio(br);

    }

    public static void mostrarCardapio(CardapioPais cardapio){
        ArrayList<Lanche> l = cardapio.getLanches();
        System.out.println("Cardápio do país " + cardapio.getNomePais());
        for (Lanche lanche:
             l) {
            System.out.println(lanche.getNome() + " - " + lanche.getDescricao() + " - R$" + lanche.getPreco());
        }
        System.out.println("\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n");
    }

    public static void mostrarCardapiosPaises(RedeRestaurantes redeRestaurantes){
        ArrayList<CardapioPais> c = redeRestaurantes.getCardapios();
        for (CardapioPais cardapio:
             c) {
            mostrarCardapio(cardapio);
        }
    }
}
