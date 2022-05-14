package oo.intellij;

import java.util.ArrayList;

public class RedeRestaurantes {

    private String nome;
    private ArrayList<Restaurante> restaurantes;
    private ArrayList<CardapioPais> cardapios;

    public RedeRestaurantes(String nome) {
        this.nome = nome;
        this.restaurantes = new ArrayList<>();
        this.cardapios = new ArrayList<>();
    }

    public void adicionarRestaurante(Restaurante restaurante){
        this.restaurantes.add(restaurante);
    }

    public void removerRestaurante(Restaurante restaurante){
        this.restaurantes.remove(restaurante);
    }

    public void adicionarCardapio(CardapioPais cardapio){
        this.cardapios.add(cardapio);
    }

    public void removerCardapio(CardapioPais cardapio){
        this.cardapios.remove(cardapio);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Restaurante> getRestaurantes() {
        return restaurantes;
    }

    public void setRestaurantes(ArrayList<Restaurante> restaurantes) {
        this.restaurantes = restaurantes;
    }

    public ArrayList<CardapioPais> getCardapios() {
        return cardapios;
    }

    public void setCardapios(ArrayList<CardapioPais> cardapios) {
        this.cardapios = cardapios;
    }
}
