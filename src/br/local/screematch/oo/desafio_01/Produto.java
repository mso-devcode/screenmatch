package br.local.screematch.oo.desafio_01;

public class Produto {

    private String nome;
    private double preco;

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

    public void aplicarDesconto(double desconto){
        double valorDesconto = preco * ( desconto / 100);
        this.preco -= valorDesconto;
    }

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome( "Caneta" );
        produto.setPreco( 1500 );

        System.out.println("Preço atual: " + produto.getPreco() );
        produto.aplicarDesconto(15);
        System.out.println("Preço com Desconto: " + produto.getPreco() );
    }
}
