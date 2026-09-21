package br.com.alura.desafio_01._03;

public class ContaBancaria {

    private double saldo;

    public void definirSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if ( valor > 0 ) {
            this.saldo += valor;
        } else {
            System.out.println("valor invalido!");
        }
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saldo indisponivel!");
        }

    }
    public void consular() {
        System.out.println("Saldo atual: " + this.saldo);
    };
}
