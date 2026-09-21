package br.local.screematch.oo.desafio_00;

import java.text.DateFormat;

public class Carro {

    String modelo;
    String cor;
    int ano;

    int anoAtual= 2026;

    String marca;
    String modeloAtual;
    void exibirFichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
    }

    void calcularIdadeCarro() {
        System.out.println("Idade do carro: " + (anoAtual - ano));
    }

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.ano = 1984;
        carro.modelo = "Ford";
        carro.cor = "Azul";

        carro.exibirFichaTecnica();
        carro.calcularIdadeCarro();
    }
}
