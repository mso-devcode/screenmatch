package br.com.alura.desafio_02._01;

public class ConversorMoeda implements ConversorFinanceira{

    private double cotacaoDolar;

    public void definirCotacaoDolar(double cotacao) {
        this.cotacaoDolar = cotacao;
    }

    @Override
    public void converterDolarParaReal(double valor) {
        System.out.printf("Valor em reais: %.2f", valor * cotacaoDolar);
    }
}
