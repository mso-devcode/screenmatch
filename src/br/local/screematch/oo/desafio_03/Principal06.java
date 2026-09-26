package br.local.screematch.oo.desafio_03;

import java.util.ArrayList;
import java.util.List;

public class Principal06 {
    public static void main(String[] args) {

        List<ContaBancaria> contas = new ArrayList<>();

        contas.add(new ContaBancaria(1, 1000.0));
        contas.add(new ContaBancaria(2, 2000.0));
        contas.add(new ContaBancaria(3, 3000.0));
        contas.add(new ContaBancaria(4, 4000.0));

        double maiorSaldo = contas.get(0).getSaldo();

        for (ContaBancaria conta : contas) {
            if (conta.getSaldo() > maiorSaldo) {
                maiorSaldo = conta.getSaldo();
            }
        }

        System.out.println("O maior saldo é: " + maiorSaldo);
    }
}
