package br.com.alura.desafio_01._03;

public class Principal {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();
        conta.definirSaldo(1000);

        ContaCorrente cc  = new ContaCorrente();
        cc.consular();
        cc.depositar(500);
        cc.sacar(200);
        cc.consular();
        cc.cobrarTarifaMensal(500);
        cc.consular();


    }
}
