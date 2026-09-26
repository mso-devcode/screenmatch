package br.local.screematch.oo.desafio_03;

public class ContaBancaria {
    private int conta;
    private double saldo;

    public ContaBancaria(int conta, double saldo) {
        this.conta = conta;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
