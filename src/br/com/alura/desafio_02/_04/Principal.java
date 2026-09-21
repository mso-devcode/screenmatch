package br.com.alura.desafio_02._04;

public class Principal {

    public static void main(String[] args) {

        ConversorTemperaturaPadrao conversorPadrao = new ConversorTemperaturaPadrao();

        double temperaturaCelsius = 25;
        double temperaturaFahrenheit =  conversorPadrao.celsiusParaFahrenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + " Celsius para fahrenheit " + temperaturaFahrenheit);

        temperaturaFahrenheit = 77;
        temperaturaCelsius = conversorPadrao.fahrenheitParaCelsius(temperaturaFahrenheit);
        System.out.println(temperaturaFahrenheit + " Celsius para fahrenheit " + temperaturaCelsius);
    }
}
