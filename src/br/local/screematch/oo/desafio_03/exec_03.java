package br.local.screematch.oo.desafio_03;

public class exec_03 {

    public static void main(String[] args) {
        Animal a = new Cachorro();

        if (a instanceof Cachorro){
            Cachorro c = (Cachorro) a;
        } else {
            System.out.println("O objeto não é uma instância de Cachorro.");
        }
    }
}
