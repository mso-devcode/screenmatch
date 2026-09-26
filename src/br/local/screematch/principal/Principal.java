package br.local.screematch.principal;

import br.local.screematch.oo.calculos.CalculadoraDeTempo;
import br.local.screematch.oo.calculos.FiltroRecomendacao;
import br.local.screematch.oo.modelos.Episodio;
import br.local.screematch.oo.modelos.Filme;
import br.local.screematch.oo.modelos.Serie;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Filme meuFilme = new Filme("Poderso chefão", 2018);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avaliaFilme(10);
        meuFilme.avaliaFilme(10);
        meuFilme.avaliaFilme(10);

        System.out.println(meuFilme.getSomaAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2010);
        lost.setDuracaoEmMinutos(50);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);

        System.out.println(lost.getDuracaoEmMinutos());
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());

        Filme seuFilme = new Filme("De volta para o Futuro", 2000);
        seuFilme.setDuracaoEmMinutos(120);
        calculadora.inclui(seuFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(100);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("Veloz e Furiosos", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avaliaFilme(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(seuFilme);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme da lista: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("To String: " +  listaDeFilmes.toString());

    }
}
