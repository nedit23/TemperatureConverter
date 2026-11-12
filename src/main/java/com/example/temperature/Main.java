package com.example.temperature;

public class Main {
    public static void main(String[] args) {

        double c = 25;

        System.out.println("TEMPERATURE CONVERTER");

        System.out.println("Celsius to Fahrenheit: "
                + TemperatureConverter.celsiusToFahrenheit(c));

        System.out.println("Celsius to Kelvin: "
                + TemperatureConverter.celsiusToKelvin(c));

        System.out.println("Fahrenheit to Celsius: "
                + TemperatureConverter.fahrenheitToCelsius(77));

        System.out.println("Kelvin to Celsius: "
                + TemperatureConverter.kelvinToCelsius(298.15));

        System.out.println("Fahrenheit to Kelvin: "
                + TemperatureConverter.fahrenheitToKelvin(77));

        System.out.println("Kelvin to Fahrenheit: "
                + TemperatureConverter.kelvinToFahrenheit(298.15));
    }
}
