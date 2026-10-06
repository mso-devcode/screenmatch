package br.local.screematch.oo.desafio_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartaoCredito {
    Scanner sc = new Scanner(System.in);

    private double limite;
    private double saldo;
    private List<Compra> compras;


    public CartaoCredito() {
        perguntaMensagem("Criando cartão de crédito com limite: ");
        this.saldo = this.limite;
        this.compras = new ArrayList<>();
    }

    private void perguntaMensagem(String mensagem) {
        System.out.print(mensagem + " R$: " );
        this.limite = sc.nextDouble();
    }

    public boolean realizarCompra(Compra compra) {
        if (compra.getValor() <= saldo) {
            compras.add(compra);
            saldo -= compra.getValor();
            System.out.println("Compra realizada: " + compra.getDescricao() + " - Valor: " + compra.getValor());
            return true;
        } else {
            System.out.println("Saldo insuficiente para realizar a compra: " + compra.getDescricao() + " - Valor: " + compra.getValor());
            return false;
        }

    }

    public List<Compra> getCompras() {
        return compras;
    }

    public double getSaldo() {
        return saldo;
    }
}
