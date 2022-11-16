package com.btpn.chipacademy.exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

class MeasurementTest {
    @Test
    void equals_shouldReturnTrue_when100CelsiusEquals212Fahrenheit() {
        Measurement oneHundredCelsius = new Measurement(100, Metric.CELSIUS);
        Measurement twoHundredAndTwelveFahrenheit = new Measurement(212, Metric.FAHRENHEIT);

        Assertions.assertEquals(oneHundredCelsius, twoHundredAndTwelveFahrenheit);
    }

    @Test
    void equals_shouldReturnTrue_when273Point15KelvinEquals32Fahrenheit() {
        Measurement twoHundredSeventyThreePointOneFiveKelvin = new Measurement(273.15, Metric.KELVIN);
        Measurement thirtyTwoFahrenheit = new Measurement(32, Metric.FAHRENHEIT);

        Assertions.assertEquals(twoHundredSeventyThreePointOneFiveKelvin, thirtyTwoFahrenheit);
    }

    @Test
    void equalsContract() {
        EqualsVerifier
        .forClass(Measurement.class)
        .suppress(Warning.NULL_FIELDS, Warning.STRICT_HASHCODE, Warning.ALL_FIELDS_SHOULD_BE_USED)
        .verify();
    }
}