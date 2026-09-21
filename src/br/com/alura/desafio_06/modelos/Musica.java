package br.com.alura.desafio_06.modelos;

public class Musica  extends Audio{

    private String albun;
    private String artista;
    private String genero;

    public String getAlbun() {
        return albun;
    }

    public void setAlbun(String albun) {
        this.albun = albun;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        if ( this.getTotalDeProducoes() > 2000) {
            return 10;
        } else {
            return 7;
        }
    }
}
