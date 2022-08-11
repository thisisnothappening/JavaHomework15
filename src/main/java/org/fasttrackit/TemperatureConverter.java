package org.fasttrackit;

public class TemperatureConverter {
    public static double celsiusToFahrenheit(double temperature) {
        return temperature * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double temperature) {
        return (temperature - 32) * 5 / 9;
    }
}
