package br.com.alura.desafio_02._02;

public class CalculadoraSalaTrangular implements CalculoGeometrico {

    @Override
    public void calcularArea(double altura, double largura) {
        double areaDoRetangulo = altura * largura;
        System.out.println("Área do retangulo: " + areaDoRetangulo);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double  perimetroDoRetangulo = 2 * (altura + largura);
        System.out.println("Perimetro do retangulo: " + perimetroDoRetangulo);
    }
}
