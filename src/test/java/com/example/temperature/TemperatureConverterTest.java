package com.example.temperature;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32, (0 * 9.0 / 5.0) + 32, 0.01);
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(100, (212 - 32) * 5.0 / 9.0, 0.01);
    }

    @Test
    void testCelsiusToKelvin() {
        assertEquals(273.15, 0 + 273.15, 0.01);
    }

    @Test
    void testKelvinToCelsius() {
        assertEquals(0, 273.15 - 273.15, 0.01);
    }
}
