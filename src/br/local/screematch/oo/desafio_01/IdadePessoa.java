package br.local.screematch.oo.desafio_01;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void veridicarIdade() {
        if (idade >= 18) {
            System.out.println("Idade maior que 18");
        } else {
            System.out.println("Idade menor que 18");
        }
    }

    public static void main(String[] args) {
        IdadePessoa pessoa = new IdadePessoa();
        pessoa.setNome("Carlos");
        pessoa.setIdade(53);

        System.out.println("Nome: " + pessoa.getNome() +
                "\nIdade: " + pessoa.getIdade() + " idade.");
        pessoa.veridicarIdade();

    }
}
