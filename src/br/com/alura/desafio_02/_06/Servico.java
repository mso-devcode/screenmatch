package br.com.alura.desafio_02._06;

public class Servico  implements Vendavel{

    private double preco;
    private String descricao;

    public double getPreco() {
        return preco;
    }

    public Servico(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    @Override
    public double calcularPreco(int quantidade) {
        return preco * quantidade;
    }

    @Override
    public void aplicarDesconto(double percemtualDesconto) {
        this.preco -= (preco * (percemtualDesconto / 100));
        // this.preco = this.preco -
    }
}
