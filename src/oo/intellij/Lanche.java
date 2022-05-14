package oo.intellij;

public class Lanche {

    private String nome, descricao;
    private float preco;

    public Lanche( String nome, String descricao, float preco) {
        this.descricao = descricao;
        this.nome = nome;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
