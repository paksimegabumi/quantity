package com.btpn.chipacademy.exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LengthTest {
    @Test
    void equals_shouldReturnTrue_when100CentimetersEqualsTo1Meter() {
        Length oneHundredCentimeter = new Length(100, "Centimeter");
        Length oneMeter = new Length(1, "Meter");

        Assertions.assertEquals(oneHundredCentimeter, oneMeter);
    }

    @Test
    void equals_shouldReturnFalse_when100CentimeterEqualsTo2Meter() {
        Length oneHundredCentimeter = new Length(100, "Centimeter");
        Length twoMeter = new Length(2, "Meter");

        Assertions.assertNotEquals(oneHundredCentimeter, twoMeter);
    }
}