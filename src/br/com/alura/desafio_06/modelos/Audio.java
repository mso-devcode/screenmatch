package br.com.alura.desafio_06.modelos;

public class Audio {

    private String titulo;
    private String duracao;
    private int totalDeProducoes;
    private int totalCurtidas;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracao() {
        return duracao;
    }

    public int getTotalDeProducoes() {
        return totalDeProducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curtir () {
        this.totalCurtidas++;
    }

    public void reproduzir (){
        this.totalDeProducoes++;
    }




 }
