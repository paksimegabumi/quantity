package com.btpn.chipacademy.exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MetricTest {
    @Test
    void toStandardInternationalValue_shouldReturn1_whenUnitIsCentimeter() {
        double expectedConvertedValue = 1;
        Measurement oneHundredCentiMeters = new Measurement(100, Metric.CENTIMETER);

        double actualConvertedValue = Metric.METER.toStandardInternationalValue(oneHundredCentiMeters);

        Assertions.assertEquals(expectedConvertedValue, actualConvertedValue);
    }

    @Test
    void toStandardInternationalValue_shouldReturnDifferentTypeException_whenUnitIsCentimeterAndConvertedToGram() {
        Measurement oneHundredCentiMeters = new Measurement(100, Metric.CENTIMETER);

        Assertions.assertThrows(DifferentMetricTypeException.class, () -> Metric.GRAMS.toStandardInternationalValue(oneHundredCentiMeters));
    }

    @Test
    void toStandardInternationalValue_shouldReturn10_whenUnitIsFahrenheit() {
        double expectedConvertedValue = 10;
        Measurement fiftyFahrenheit = new Measurement(50, Metric.FAHRENHEIT);

        double actualConvertedValue = Metric.CELSIUS.toStandardInternationalValue(fiftyFahrenheit);

        Assertions.assertEquals(expectedConvertedValue, actualConvertedValue);
    }

}
