package com.example.temperature;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double c) {
        return (c * 9.0 / 5.0) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5.0 / 9.0;
    }

    public static double celsiusToKelvin(double c) {
        return c + 273.15;
    }

    public static double kelvinToCelsius(double k) {
        validateKelvin(k);
        return k - 273.15;
    }

    public static double fahrenheitToKelvin(double f) {
        return (f - 32) * 5.0 / 9.0 + 273.15;
    }

    public static double kelvinToFahrenheit(double k) {
        validateKelvin(k);
        return (k - 273.15) * 9.0 / 5.0 + 32;
    }

    private static void validateKelvin(double k) {
        if (!Double.isFinite(k) || k < 0) {
            throw new IllegalArgumentException("Invalid Kelvin value");
        }
    }
}
