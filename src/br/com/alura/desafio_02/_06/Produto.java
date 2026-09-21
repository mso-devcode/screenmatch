package br.com.alura.desafio_02._06;

public class Produto implements Vendavel{
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public double calcularPreco(int quantidade) {
        return preco * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        this.preco -= preco * (percentualDesconto / 100);
    }
}
