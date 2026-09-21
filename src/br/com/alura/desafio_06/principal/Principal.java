package br.com.alura.desafio_06.principal;

import br.com.alura.desafio_06.modelos.MinhasPreferidas;
import br.com.alura.desafio_06.modelos.Musica;
import br.com.alura.desafio_06.modelos.Podcast;

public class Principal {

    public static void main(String[] args) {

        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Forever");
        minhaMusica.setArtista("Kiss");

        for ( int i = 0; i < 1000; i++ ) {
            minhaMusica.reproduzir();
        }

        for ( int i = 0; i < 50; i++ ) {
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolaDev");
        meuPodcast.setHost("Marmos Mendes");

        for ( int i = 0; i < 5000; i++ ) {
            meuPodcast.reproduzir();
        }


        for ( int i = 0; i < 1000; i++ ) {
            meuPodcast.curtir();
        }

        MinhasPreferidas preferida = new MinhasPreferidas();

        preferida.inclui(meuPodcast);
        preferida.inclui(minhaMusica);

    }
}
