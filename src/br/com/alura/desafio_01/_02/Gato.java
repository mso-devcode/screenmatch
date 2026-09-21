package br.com.alura.desafio_01._02;

public class Gato extends Animal {

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("gato faz MIAU!!!");
    }

    public void arranharMoveis() {
        System.out.println(" O Animal arranhado !");
    }
}
