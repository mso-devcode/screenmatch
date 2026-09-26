package br.local.screematch.principal;

import br.local.screematch.oo.modelos.Filme;
import br.local.screematch.oo.modelos.Serie;
import br.local.screematch.oo.modelos.Titulo;

import java.util.ArrayList;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Poderso chefão", 2018);
        meuFilme.avaliaFilme(10);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avaliaFilme(6);
        var filmeDoPaulo = new Filme("Veloz e Furiosos", 2003);
        filmeDoPaulo.avaliaFilme(4);
        Serie lost = new Serie("Lost", 2010);


        List<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(filmeDoPaulo);
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(lost);

        listaDeAssistidos.forEach(System.out::println);

//        listaDeAssistidos.forEach(lista -> System.out.println(lista.toString()));
        listaDeAssistidos.forEach( item -> {
            System.out.println("Nome: "+ item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        });

        /*
        for (Titulo item : listaDeAssistidos) {
            System.out.println(item);

            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
        */
        System.out.println("Tamanho da lista: " + listaDeAssistidos.size());
        System.out.println("Primeiro filme: " + listaDeAssistidos.get(0).getNome());
    }
}
