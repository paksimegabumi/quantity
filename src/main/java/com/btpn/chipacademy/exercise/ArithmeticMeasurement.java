package com.btpn.chipacademy.exercise;

public class ArithmeticMeasurement extends Measurement {
    private ArithmeticMeasurement(double value, Metric metric) {
        super(value, metric);
    }

    static ArithmeticMeasurement createCentimeter(double value) {
        return new ArithmeticMeasurement(value, Metric.CENTIMETER);
    }

    static ArithmeticMeasurement createMeter(double value) {
        return new ArithmeticMeasurement(value, Metric.METER);
    }

    static ArithmeticMeasurement createKilometer(double value) {
        return new ArithmeticMeasurement(value, Metric.KILOMETER);
    }

    static ArithmeticMeasurement createGram(double value) {
        return new ArithmeticMeasurement(value, Metric.GRAMS);
    }

    static ArithmeticMeasurement createKilogram(double value) {
        return new ArithmeticMeasurement(value, Metric.KILOGRAM);
    }

    public ArithmeticMeasurement add(Measurement otherMeasurement) {
        double convertedOtherMeasurementValue = this.metric.toStandardInternationalValue(otherMeasurement);
        double result = this.value + convertedOtherMeasurementValue;
        return new ArithmeticMeasurement(result, this.metric);
    }
}
