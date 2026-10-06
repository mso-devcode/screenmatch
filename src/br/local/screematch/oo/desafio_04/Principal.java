package br.local.screematch.oo.desafio_04;

import java.util.Collections;

public class Principal {

    public static void main(String[] args) {

        CartaoCredito cc = new CartaoCredito();

        Compra mercado = new Compra("Notebook", 800.00);

        while (true) {
            System.out.println("Deseja realizar uma compra? (s/n)");
            String resposta = cc.sc.next();
            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
            System.out.println("Digite a descrição da compra: ");
            String descricao = cc.sc.next();
            System.out.println("Digite o valor da compra: ");
            double valor = cc.sc.nextDouble();
            Compra compra = new Compra(descricao, valor);
            if (!cc.realizarCompra(compra)){
                 break;
            }
        }

        if (!cc.getCompras().isEmpty()) {
            Collections.sort(cc.getCompras());
           System.out.println("Compras ordenadas por valor: ");
            for (Compra compra : cc.getCompras()) {
                System.out.println(compra);
            }
            System.out.printf("Saldo restante: R$ %.2f%n",  cc.getSaldo());
        } else {
            System.out.println("Nenhuma compra realizada.");
        }


    }
}
