package br.com.alura.exemplo;

public class Principal {

    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.setNome("Cadeira");
        produto.setValor(400);

        CalculadoraImposto calcular =  new CalculadoraImposto();
        calcular.calcularImposto(produto);
        System.out.println(calcular.getTotalImposto());

        Servico servico = new Servico();
        servico.setDescricao("Formatação de computador");
        servico.setValor(200);
        servico.setAliquotaISS(20);

        calcular.calcularImposto(servico);
        System.out.println(calcular.getTotalImposto());
    }
}
