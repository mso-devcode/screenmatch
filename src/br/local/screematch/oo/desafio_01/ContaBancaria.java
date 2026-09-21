package br.local.screematch.oo.desafio_01;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;
    public String titulas;

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

