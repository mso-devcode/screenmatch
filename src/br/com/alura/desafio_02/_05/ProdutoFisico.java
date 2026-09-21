package br.com.alura.desafio_02._05;

public class ProdutoFisico  extends Produto implements Calculavel {

    @Override
    public double calcularPrecoFinal(double desconto) {
        return preco * (desconto / 100);
    }

}
