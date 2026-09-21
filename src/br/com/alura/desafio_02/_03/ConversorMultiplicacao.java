package br.com.alura.desafio_02._03;

import java.sql.SQLOutput;

public class ConversorMultiplicacao implements Tabuada {

    private final int NUMERO_ITENS = 10;

    @Override
    public void montrarTabuada(int numero) {
        System.out.println("TABUADA - " + numero);
        for (int i = 0; i <= NUMERO_ITENS; i++) {
            System.out.println(i + " x " + numero + " = " + (i * numero));
        }
    }
}
