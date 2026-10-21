package br.local.screematch.principal;

import br.local.screematch.oo.modelos.Titulo;
import br.local.screematch.oo.modelos.TituloOMDB;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do filme que deseja buscar:");
        String urlFilme = sc.nextLine();

        String url = "https://www.omdbapi.com/?t=" + urlFilme + "&apikey=e3a094c7";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        TituloOMDB meuTituloOmdb = gson.fromJson(response.body(), TituloOMDB.class);
        System.out.println(meuTituloOmdb);

        Titulo meuTitulo = new Titulo(meuTituloOmdb);

        System.out.println("Nome do filme: " + meuTitulo);

    }
}
