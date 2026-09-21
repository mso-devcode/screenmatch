package br.com.alura.desafio_01._02;

public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("cachorro faz UAUA");
    }

    public void abanarRabo() {
        System.out.println(" O Animal abanar rabo !");
    }
}
