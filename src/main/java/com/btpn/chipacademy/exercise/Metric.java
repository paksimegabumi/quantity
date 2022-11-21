package com.btpn.chipacademy.exercise;

public enum Metric {
    CENTIMETER(MetricType.LENGTH, 0, 100), 
    METER(MetricType.LENGTH, 0, 1), 
    KILOMETER(MetricType.LENGTH, 0, 0.001), 
    GRAMS(MetricType.MASS, 0, 1000), 
    KILOGRAM(MetricType.MASS, 0, 1),
    CELSIUS(MetricType.TEMPERATURE, 0,5),
    FAHRENHEIT(MetricType.TEMPERATURE,32, 9),
    KELVIN(MetricType.TEMPERATURE,273.15, 5);
    
    private MetricType metricType;
    private double conversionRateToStandardInternational;
    private double coefficient;

    private Metric( MetricType metricType, double coefficient, double conversionRateToStandardInternational) {
        this.metricType = metricType;
        this.conversionRateToStandardInternational = conversionRateToStandardInternational;
        this.coefficient = coefficient;
    }

    private boolean isSameMetricType(Metric otherUnit){
        return this.metricType.equals(otherUnit.metricType);
    }

    public double toStandardInternationalValue(Measurement measurement) {
        return this.metricType.getInternationalStandardUnit().convertValueOf(measurement);
    }

    public double convertValueOf(Measurement measurement) {
        if (!this.isSameMetricType(measurement.metric)) {
            throw new DifferentMetricTypeException();
        }
        double newConversionValue = this.conversionRateToStandardInternational / measurement.metric.conversionRateToStandardInternational;
        return (measurement.value - measurement.metric.coefficient) * newConversionValue + this.coefficient;
    }
}
