package br.local.screematch.oo.desafio_00;

public class Calculadora {

    double dobroNúmero (double numero) {
        return numero * 2;
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado  = calculadora.dobroNúmero(5);
        System.out.println("Resultado: " + resultado);
    }
}
