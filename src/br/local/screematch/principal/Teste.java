package br.local.screematch.principal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Teste {
    public static void main(String[] args) throws Exception {

        URL url = new URL(
                "https://www.omdbapi.com/?t=matrix&apikey=e3a094c7"
        );

        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(url.openStream()));

        String linha;

        while((linha = br.readLine()) != null){
            System.out.println(linha);
        }

        br.close();
    }
}