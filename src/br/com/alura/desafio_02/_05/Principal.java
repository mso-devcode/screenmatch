package br.com.alura.desafio_02._05;

public class Principal {

    public static void main(String[] args) {

        Livro livro = new Livro();
        livro.preco = 150;
        double precoLivroFinal = livro.calcularPrecoFinal(4);
        System.out.println("Preco final: " + precoLivroFinal);

        ProdutoFisico pf = new ProdutoFisico();
        pf.preco = 250;
        double precoProdutoFisico = pf.calcularPrecoFinal(7);
        System.out.println("Preco final: " + (pf.preco - precoProdutoFisico));
    }
}
