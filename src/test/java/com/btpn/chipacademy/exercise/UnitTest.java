package com.btpn.chipacademy.exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UnitTest {
    @Test
    void toStandardInternationalValue_shouldReturn1_whenUnitIsCentimeter() {
        double expectedConvertedValue = 1;
        Measurement oneHundredCentiMeters = new Measurement(100, Unit.CENTIMETER);

        double actualConvertedValue = Unit.CENTIMETER.toStandardInternationalValue(oneHundredCentiMeters);

        Assertions.assertEquals(expectedConvertedValue, actualConvertedValue);
    }

    @Test
    void isSameUnitType_shouldReturnFalse_whenCentimeterComparedWithGram() {
        boolean expectedResult = false;

        boolean actualResult = Unit.CENTIMETER.isSameUnitType(Unit.GRAMS);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
