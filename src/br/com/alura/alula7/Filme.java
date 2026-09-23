package br.com.alura.alula7;

public class Filme {

    private String nome;
    private int duracao;

    public Filme(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Filme{name='" + nome + "', duracao=" + duracao + '}';
    }

}
