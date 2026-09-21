package br.com.alura.desafio_01._03;

public class ContaCorrente extends ContaBancaria {

    public void cobrarTarifaMensal(double tarifa) {
        if (tarifa >= 0) {
            this.sacar(tarifa);
        } else {
            System.out.println("valor invalido");
        }
    }
}
