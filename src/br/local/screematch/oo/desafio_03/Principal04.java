package br.local.screematch.oo.desafio_03;

import java.util.ArrayList;
import java.util.List;

public class Principal04 {

    public static void main(String[] args) {

        List<Forma> formas = new ArrayList<>();
        formas.add(new Circulo());
        formas.add(new Quadrado());

        for (Forma forma : formas) {
            forma.calcularArea();
        }


    }
}
