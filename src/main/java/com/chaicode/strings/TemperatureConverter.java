package com.chaicode.strings;

/**
 * WeatherWise Temperature Converter
 *
 * <p>
 * Convert between Celsius and Fahrenheit for a travel weather app.
 *
 * <p>
 * Formulas:
 * <ul>
 * <li>F = C × 9/5 + 32</li>
 * <li>C = (F - 32) × 5/9</li>
 * </ul>
 *
 * <p>
 * Round results to 1 decimal: Math.round(value * 10.0) / 10.0
 */
public final class TemperatureConverter {

    private TemperatureConverter() {
    }

    public static double celsiusToFahrenheit(double celsius) {
        // Your code here
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        return Math.round(fahrenheit * 10.0) / 10.0;

    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        // Your code here

        double celsius = (fahrenheit - 32) * 5.0 / 9.0;

        return Math.round(celsius * 10.0) / 10.0;
        // return 0.0;
    }
}
