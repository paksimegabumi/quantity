package com.btpn.chipacademy.exercise;

import java.util.Objects;

public class Measurement {
    protected final double value;
    protected final Metric metric;

    public Measurement(double value, Metric metric) {
        this.value = value;
        this.metric = metric;
    }

    static Measurement createCelsius(double value) {
        return new Measurement(value, Metric.CELSIUS);
    }

    static Measurement createFahrenheit(double value) {
        return new Measurement(value, Metric.FAHRENHEIT);
    }

    static Measurement createKelvin(double value) {
        return new Measurement(value, Metric.KELVIN);
    }

    @Override
    public boolean equals(Object object) {
        if(object == this) {
            return true;
        }

        if(!(object instanceof Measurement)) {
            return false;
        }

        Measurement otherMeasurement = (Measurement) object;
        double thisValue = this.value;
        double otherValue = otherMeasurement.value;
        try {
            thisValue = this.metric.toStandardInternationalValue(this);
            otherValue = this.metric.toStandardInternationalValue(otherMeasurement);
        } catch (DifferentMetricTypeException e) {
            return false;
        }
        
        return Double.compare(thisValue, otherValue) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.value, this.metric);
    }
}
