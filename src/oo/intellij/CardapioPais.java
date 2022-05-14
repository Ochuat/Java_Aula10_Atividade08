package oo.intellij;

import java.util.ArrayList;

public class CardapioPais {

    private String nomePais;
    private ArrayList<Lanche> lanches;

    public CardapioPais(String nomePais) {
        this.nomePais = nomePais;
        this.lanches = new ArrayList<>();
    }

    public void adicionarLanche(Lanche lanche){
        this.lanches.add(lanche);
    }

    public void adcionarLanche(String nome, String descricao, float preco){
        Lanche l = new Lanche(nome, descricao, preco);
        adicionarLanche(l);
    }

    public void removerLanche(Lanche lanche){
        this.lanches.remove(lanche);
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public ArrayList<Lanche> getLanches() {
        return lanches;
    }

    public void setLanches(ArrayList<Lanche> lanches) {
        this.lanches = lanches;
    }
}
