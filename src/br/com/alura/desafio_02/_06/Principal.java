package br.com.alura.desafio_02._06;

public class Principal {

    public static void main(String[] args) {

        Produto produto = new Produto("Cadeira", 340);
        Servico servico = new Servico("Programação", 2000);

        double precoDosProdutos = produto.calcularPreco(4);
        produto.aplicarDesconto(15);
        System.out.println("Preco do produto com desconto: " + (precoDosProdutos - produto.getPreco()));


        precoDosProdutos = servico.calcularPreco(3);
        servico.aplicarDesconto(20);
        System.out.println("Preco do produto com desconto: " + (precoDosProdutos - servico.getPreco()));


    }
}
