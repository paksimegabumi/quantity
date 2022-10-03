package com.btpn.chipacademy.exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LengthTest {
    @Test
    void equals_shouldReturnTrue_when100CentimetersEqualsTo1Meter() {
        Length oneHundredCentimeter = new Length(100, Unit.CENTIMETER);
        Length oneMeter = new Length(1, Unit.METER);

        Assertions.assertEquals(oneHundredCentimeter, oneMeter);
    }

    @Test
    void equals_shouldReturnFalse_when100CentimeterEqualsTo2Meters() {
        Length oneHundredCentimeter = new Length(100, Unit.CENTIMETER);
        Length twoMeter = new Length(2, Unit.METER);

        Assertions.assertNotEquals(oneHundredCentimeter, twoMeter);
    }

    @Test
    void equals_shouldReturnTrue_when2MetersEqualsTo200Centimeters() {
        Length twoHundredCentimeter = new Length(200, Unit.CENTIMETER);
        Length twoMeter = new Length(2, Unit.METER);

        Assertions.assertEquals(twoMeter, twoHundredCentimeter);
    }
}