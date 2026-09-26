package br.local.screematch.oo.desafio_03;

public class Quadrado implements Forma{

    @Override
    public void calcularArea() {
        double lado = 5; // Exemplo de valor para o lado do quadrado
        double area = Math.pow(lado, 2);
        System.out.println("Área do quadrado: " + area);
    }
}
