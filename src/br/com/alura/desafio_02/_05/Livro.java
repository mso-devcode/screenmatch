package br.com.alura.desafio_02._05;

public class Livro extends Produto implements Calculavel {

    private String autor;
    @Override
    public double calcularPrecoFinal(double desconto) {
        return  preco * (desconto / 100);
    }
}
