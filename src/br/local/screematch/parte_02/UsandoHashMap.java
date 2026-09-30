package br.local.screematch.parte_02;

import java.util.HashMap;
import java.util.Map;

public class UsandoHashMap {

    public static void main(String[] args) {

        Map<String, Integer> usandoMapHash = new HashMap<>();

        usandoMapHash.put("A", 1);
        usandoMapHash.put("B", 2);
        usandoMapHash.put("C", 3);

        int valor = usandoMapHash.get("A");
        System.out.println("Valor da chave A: " + valor);

        usandoMapHash.remove("B");

        for (String chave : usandoMapHash.keySet()) {
            System.out.println("Chave: " + chave + ", Valor: " + usandoMapHash.get(chave));
        }
    }
}
