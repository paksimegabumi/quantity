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
}