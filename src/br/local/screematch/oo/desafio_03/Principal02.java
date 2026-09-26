package br.local.screematch.oo.desafio_03;

import java.util.ArrayList;
import java.util.List;

public class Principal02 {

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();
        double valorTotalPrecos = 0.0;

        produtos.add(new Produto("Produto 1", 10.0));
        produtos.add(new Produto("Produto 2", 20.0));
        produtos.add(new Produto("Produto 3", 30.0));

        for (Produto produto : produtos){
            valorTotalPrecos += produto.getPreco();
        }

        if (!produtos.isEmpty()) {
            double precoMedio = valorTotalPrecos / produtos.size();
            System.out.println("Preço médio dos produtos: " + precoMedio);
        }else {
            System.out.println("A lista de produtos está vazia.");
        }
    }
}
