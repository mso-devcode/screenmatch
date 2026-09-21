package br.local.screematch.oo.desafio_01;

public class Aluno {

    private String nome;
    private double[] notas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){

        double somaDasNotas = 0.0;

        for ( int i = 0; i < this.notas.length; i++ ){
            somaDasNotas += this.notas[i];
        }

        return somaDasNotas / this.notas.length;
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Fernando");

        aluno.setNotas(new double[]{5,6.7,8.9});

        System.out.printf("Média do %S : %.2f" ,aluno.getNome(), aluno.calcularMedia());
    }
}
