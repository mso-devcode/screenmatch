package br.local.screematch.oo.desafio_03;

import java.util.ArrayList;

public class exec_01 {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Paulo");
        nomes.add("Pedro");
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Ana");

        for(String nome : nomes) {
            System.out.println("Nome:" + nome);
        }
    }
}
