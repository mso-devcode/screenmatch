package br.com.alura.desafio_07;

import java.awt.image.TileObserver;
import java.util.ArrayList;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    public static void main(String[] args) {

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        Produto nossoProduto = new Produto();
        nossoProduto.setNome("Monitor");
        nossoProduto.setPreco(1250.00);
        nossoProduto.setQuantidade(3);

        Produto meuProduto = new Produto("Notebook", 2500.00, 5);
        Produto serProduto = new Produto("Smartphone", 1500.00, 10);
        Produto teuProduto = new Produto("Tablet", 800.00, 7);

        listaDeProdutos.add(meuProduto);
        listaDeProdutos.add(serProduto);
        listaDeProdutos.add(teuProduto);
        listaDeProdutos.add(nossoProduto);


        for (Produto produto : listaDeProdutos) {
            System.out.println(produto);
        }

        ProdutoPerecivel pc = new ProdutoPerecivel("Leite", 5.00, 20, "2024-07-01");
        System.out.println(pc);


    }
}
