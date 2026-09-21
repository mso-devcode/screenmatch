package br.com.alura.desafio_01._02;

public class Principal {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        System.out.println();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();

    }
}
