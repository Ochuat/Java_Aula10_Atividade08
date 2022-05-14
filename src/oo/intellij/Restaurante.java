package oo.intellij;

public class Restaurante {

    private String nome, endereco;
    private CardapioPais cardapio;

    public Restaurante(String nome, String endereco, CardapioPais cardapio) {
        this.nome = nome;
        this.endereco = endereco;
        this.cardapio = cardapio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public CardapioPais getCardapio() {
        return cardapio;
    }

    public void setCardapio(CardapioPais cardapio) {
        this.cardapio = cardapio;
    }
}
