package com.btpn.chipacademy.exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MeasurementTest {
    @Test
    void equals_shouldReturnTrue_when100CentimetersEqualsTo1Meter() {
        Measurement oneHundredCentimeter = new Measurement(100, Unit.CENTIMETER);
        Measurement oneMeter = new Measurement(1, Unit.METER);

        Assertions.assertEquals(oneHundredCentimeter, oneMeter);
    }

    @Test
    void equals_shouldReturnFalse_when100CentimeterEqualsTo2Meters() {
        Measurement oneHundredCentimeter = new Measurement(100, Unit.CENTIMETER);
        Measurement twoMeter = new Measurement(2, Unit.METER);

        Assertions.assertNotEquals(oneHundredCentimeter, twoMeter);
    }

    @Test
    void equals_shouldReturnTrue_when2MetersEqualsTo200Centimeters() {
        Measurement twoHundredCentimeter = new Measurement(200, Unit.CENTIMETER);
        Measurement twoMeter = new Measurement(2, Unit.METER);

        Assertions.assertEquals(twoMeter, twoHundredCentimeter);
    }

    @Test
    void equals_shouldReturnTrue_when1KilometersEqualsTo1000Meters() {
        Measurement oneThousandMeters = new Measurement(1000, Unit.METER);
        Measurement oneKilometer = new Measurement(1, Unit.KILOMETER);

        Assertions.assertEquals(oneKilometer, oneThousandMeters);
    }

    @Test
    void equals_shouldReturnTrue_when100GramsEqualsTo1Kilogram() {
        Measurement oneThousandGrams = new Measurement(1000, Unit.GRAMS);
        Measurement oneKilograms = new Measurement(1, Unit.KILOGRAM);

        Assertions.assertEquals(oneThousandGrams, oneKilograms);
    }

    @Test
    void equals_shouldReturnFalse_when1GramEqualsTo1Meter() {
        Measurement oneThousandGram = new Measurement(1000, Unit.GRAMS);
        Measurement oneMeter = new Measurement(1, Unit.METER);

        Assertions.assertNotEquals(oneThousandGram, oneMeter);
    }

    @Test
    void add_shouldReturn2M_whenGivenValue1MeterAnd100Centimeter() {
        Measurement expectedResult = new Measurement(2, Unit.METER);
        Measurement oneHundredCentimeter = new Measurement(100, Unit.CENTIMETER);
        Measurement oneMeter = new Measurement(1, Unit.METER);

        Measurement actualResult = oneMeter.add(oneHundredCentimeter);

        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    void equals_shouldReturnTrue_when100CelsiusEquals212Fahrenheit() {
        Measurement oneHundredCelsius = new Measurement(100, Unit.CELSIUS);
        Measurement twoHundredAndTwelveFahrenheit = new Measurement(212, Unit.FAHRENHEIT);

        Assertions.assertEquals(oneHundredCelsius, twoHundredAndTwelveFahrenheit);
    }

    @Test
    void equals_shouldReturnTrue_when273Point15KelvinEquals32Fahrenheit() {
        Measurement twoHundredSeventyThreePointOneFiveKelvin = new Measurement(273.15, Unit.KELVIN);
        Measurement thirtyTwoFahrenheit = new Measurement(32, Unit.FAHRENHEIT);

        Assertions.assertEquals(twoHundredSeventyThreePointOneFiveKelvin, thirtyTwoFahrenheit);
    }
}