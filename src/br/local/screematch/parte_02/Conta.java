package br.local.screematch.parte_02;

public class Conta implements Comparable<Conta> {

    private String titular;
    private double saldo;

    public Conta(String titular, double saldo) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public int compareTo(Conta outraConta) {

        if (this.getSaldo() < outraConta.getSaldo()) {
            return 1;
        } else if (this.getSaldo() > outraConta.getSaldo()) {
            return -1;
        } else {
            return 0;
        }
    }
}
