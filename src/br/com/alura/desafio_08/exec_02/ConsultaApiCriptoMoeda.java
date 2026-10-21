package br.com.alura.desafio_08.exec_02;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaApiCriptoMoeda {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o código da criptomoeda (ex: BTC, ETH, LTC): ");
        String codigo = input.nextLine();

        String url = "https://api.coingecko.com/api/v3/simple/price?ids=" + codigo + "&vs_currencies=usd";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(java.net.URI.create(url))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println("Resposta da API: " + response.body());

    }
}
