package br.local.screematch.oo.desafio_00;

public class Aluno {
    String nome;
    int idade;

    void exibirDados(){
        System.out.printf("Nome do aluno: %s\n", nome);
        System.out.printf("Idade do aluno: %d\n", idade);
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.nome = "Carlos Gonzaga";
        aluno.idade = 19;

        aluno.exibirDados();
    }



}
