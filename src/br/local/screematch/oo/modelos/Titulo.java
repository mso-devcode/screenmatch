package br.local.screematch.oo.modelos;

public class Titulo {

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {

        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {

        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {

        this.anoDeLancamento = anoDeLancamento;
    }

    public double getSomaAvaliacoes() {
        return somaAvaliacoes;
    }

    public void exibeFichaTecnica(){
        System.out.println("****** Filme Técnia ******");
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
        System.out.println("Duração em MInutos: " +  duracaoEmMinutos);
    }

    public void avaliaFilme(double nota){
        somaAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    public double pegaMedia() {
        return somaAvaliacoes / totalDeAvaliacao;
    }

}
