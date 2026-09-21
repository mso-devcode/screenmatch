package br.com.alura.desafio_01._01;

public class Carro {
    private String modelo;
    private double precoAno2000;
    private double precoAno2001;
    private double precoAno2002;

    public void definirModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPrecos(double precoAno2000, double precoAno2001, double precoAno2002) {
        this.precoAno2000 = precoAno2000;
        this.precoAno2001 = precoAno2001;
        this.precoAno2002 = precoAno2002;
    }

    public double calcularPrecoMedio() {
        return (precoAno2000 + precoAno2001 + precoAno2002) / 3;
    }

    public void exibrDetalhes() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("O Preço 1: " + this.precoAno2000);
        System.out.println("O Preço 2: " + this.precoAno2001);
        System.out.println("O Preço 3: " + this.precoAno2002);
        System.out.printf("A media dos proços:  %.2f%n", calcularPrecoMedio());
        System.out.println("O menor preço: " + exibrMenorPreco());
        System.out.println("O maior preço: " + exibrMaiorPreco());
    }

    public double exibrMenorPreco() {
        double menorPreco = precoAno2000;

        if (menorPreco < precoAno2001) {
            menorPreco = precoAno2001;
        } else if (menorPreco < precoAno2002) {
            menorPreco = precoAno2002;
        }

        return menorPreco;
    }

    public double exibrMaiorPreco() {
        double maiorPreco = precoAno2000;

        if (maiorPreco > precoAno2001) {
            maiorPreco = precoAno2001;
        } else if (maiorPreco < precoAno2002) {
            maiorPreco = precoAno2002;
        }
        return maiorPreco;
    }

    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.definirModelo("BMW");
        carro.definirPrecos(1200,900,2000);
        double mediaDosPrecos = carro.calcularPrecoMedio();
        carro.exibrDetalhes();
    }
}
