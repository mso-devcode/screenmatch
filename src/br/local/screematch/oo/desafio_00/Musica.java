package br.local.screematch.oo.desafio_00;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numeroAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("""
        ***** FICHA TÉCNICA *****
        Titulo:         %s
        Artista:        %s
        Ano:            %s
                """.formatted(titulo,artista,anoDeLancamento));
    }

    void avaliarMusica(double avaliacao) {
        this.avaliacao += avaliacao;
        numeroAvaliacoes++;
    }

    double pegaMediaAvaliacoes() {
        return avaliacao / numeroAvaliacoes;
    }


    public static void main(String[] args) {
        Musica m1 = new Musica();
        m1.titulo = "Até Mais Ver!";
        m1.artista = "Trio Forrozão";
        m1.anoDeLancamento = 1975;
        m1.exibeFichaTecnica();

        m1.avaliarMusica(7.8);
        m1.avaliarMusica(10);
        m1.avaliarMusica(1);

        System.out.printf("Média das Avaliações: %.2f", m1.pegaMediaAvaliacoes());

    }
}
