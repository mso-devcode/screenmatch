package br.com.alura.desafio_06.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() > 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto" +
                    " e preferido por todos!");
        } else {
            System.out.println(audio.getTitulo() + " Também é dos que todo mundo está curtindo");
        }
    }
}
