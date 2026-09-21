package br.local.screematch.oo.desafio_01;

public class Livro {
    private String titulo;
    private String autor;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void exibirDetalhes(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
    }

    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setTitulo("Livro 1");
        livro.setAutor("Bob Marley");

        livro.exibirDetalhes();
    }

}
