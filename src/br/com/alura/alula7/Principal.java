package br.com.alura.alula7;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        Filme meuFilme = new Filme("O Poderoso Chefão", 175);
        Filme seuFilme = new Filme("O Poderoso Chefão", 175);
        Filme teuFilme = new Filme("O Poderoso Chefão", 175);

        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(seuFilme);
        listaDeFilmes.add(teuFilme);

        for (Filme filme : listaDeFilmes) {
            System.out.println(filme);
        }



    }
}
