package org.fasttrackit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {

    @Test
    @DisplayName("It should convert from Celsius to Fahrenheit")
    void itShouldConvertFromCelsiusToFahrenheit() {
        // Given
        double celsius = 25.74;

        // When
        double result = TemperatureConverter.celsiusToFahrenheit(celsius);

        // Then
        Assertions.assertThat(TemperatureConverter.celsiusToFahrenheit(25.74)).isEqualTo(78.332);
    }

    @Test
    @DisplayName("It should convert from Fahrenheit to Celsius")
    void itShouldConvertFromFahrenheitToCelsius() {
        // Given
        double fahrenheit = 314.9996;

        // When
        double result = TemperatureConverter.fahrenheitToCelsius(fahrenheit);

        // Then
        Assertions.assertThat(result).isEqualTo(157.222);
    }
}
