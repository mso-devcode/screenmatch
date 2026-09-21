package br.com.alura.exemplo;

public class CalculadoraImposto {

    private double totalImposto = 0;

    public void calcularImposto(Tributavel tributo) {
        this.totalImposto += tributo.getValorImposto();
    }

    public double getTotalImposto() {
        return this.totalImposto;
    }
}
