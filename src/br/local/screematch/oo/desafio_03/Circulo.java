package br.local.screematch.oo.desafio_03;

public class Circulo implements Forma{

    @Override
    public void calcularArea(){
        double raio = 3; // Exemplo de valor para o raio do círculo
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("Área do círculo: " + area);
    }
}
