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
    void toStandardInternationalValue_shouldReturnDifferentTypeException_whenUnitIsCentimeterAndConvertedToGram() {
        Measurement oneHundredCentiMeters = new Measurement(100, Unit.CENTIMETER);

        Assertions.assertThrows(DifferentUnitTypeException.class, () -> Unit.GRAMS.toStandardInternationalValue(oneHundredCentiMeters));
    }

    @Test
    void toStandardInternationalValue_shouldReturn10_whenUnitIsFarenheit() {
        double expectedConvertedValue = 10;
        Measurement fiftyFarenheit = new Measurement(50, Unit.FARENHEIT);

        double actualConvertedValue = Unit.CELCIUS.toStandardInternationalValue(fiftyFarenheit);

        Assertions.assertEquals(expectedConvertedValue, actualConvertedValue);
    }

}
