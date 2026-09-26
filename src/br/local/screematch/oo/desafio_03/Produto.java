package br.local.screematch.oo.desafio_03;

import java.util.List;

public class Produto {

    private String descricao;
    private double preco;

    public Produto(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }
    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }


}
