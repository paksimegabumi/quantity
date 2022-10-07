package com.btpn.chipacademy.exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArithmeticMeasurementTest {
    @Test
    void equals_shouldReturnTrue_when100CentimetersEqualsTo1Meter() {
        ArithmeticMeasurement oneHundredCentimeter = ArithmeticMeasurement.createCentimeter(100);
        ArithmeticMeasurement oneMeter = ArithmeticMeasurement.createMeter(1);

        Assertions.assertEquals(oneHundredCentimeter, oneMeter);
    }

    @Test
    void equals_shouldReturnFalse_when100CentimeterNotEqualsTo2Meters() {
        ArithmeticMeasurement oneHundredCentimeter = ArithmeticMeasurement.createCentimeter(100);
        ArithmeticMeasurement twoMeter = ArithmeticMeasurement.createMeter(2);

        Assertions.assertNotEquals(oneHundredCentimeter, twoMeter);
    }

    @Test
    void equals_shouldReturnTrue_when2MetersEqualsTo200Centimeters() {
        ArithmeticMeasurement twoHundredCentimeter = ArithmeticMeasurement.createCentimeter(200);
        ArithmeticMeasurement twoMeter = ArithmeticMeasurement.createMeter(2);

        Assertions.assertEquals(twoMeter, twoHundredCentimeter);
    }

    @Test
    void equals_shouldReturnTrue_when1KilometersEqualsTo1000Meters() {
        ArithmeticMeasurement oneThousandMeters = ArithmeticMeasurement.createMeter(1_000);
        ArithmeticMeasurement oneKilometer = ArithmeticMeasurement.createKilometer(1);

        Assertions.assertEquals(oneKilometer, oneThousandMeters);
    }

    @Test
    void equals_shouldReturnTrue_when100GramsEqualsTo1Kilogram() {
        ArithmeticMeasurement oneThousandGrams =ArithmeticMeasurement.createGram(1_000);
        ArithmeticMeasurement oneKilograms = ArithmeticMeasurement.createKilogram(1);

        Assertions.assertEquals(oneThousandGrams, oneKilograms);
    }

    @Test
    void equals_shouldReturnFalse_when1GramEqualsTo1Meter() {
        Measurement oneThousandGram = ArithmeticMeasurement.createGram(1_000);
        Measurement oneMeter = ArithmeticMeasurement.createMeter(1);

        Assertions.assertNotEquals(oneThousandGram, oneMeter);
    }

    @Test
    void add_shouldReturn2M_whenGivenValue1MeterAnd100Centimeter() {
        ArithmeticMeasurement expectedResult = ArithmeticMeasurement.createMeter(2);
        ArithmeticMeasurement oneHundredCentimeter = ArithmeticMeasurement.createCentimeter(100);
        ArithmeticMeasurement oneMeter = ArithmeticMeasurement.createMeter(1);

        ArithmeticMeasurement actualResult = oneMeter.add(oneHundredCentimeter);

        Assertions.assertEquals(actualResult, expectedResult);
    }

}