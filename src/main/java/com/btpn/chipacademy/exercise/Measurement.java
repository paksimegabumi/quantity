package com.btpn.chipacademy.exercise;

import java.util.Objects;

public class Measurement {
    private final double value;
    private final Unit unit;

    public Measurement(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
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
            thisValue = this.unit.toStandardInternationalValue(this);
            otherValue = otherMeasurement.unit.toStandardInternationalValue(otherMeasurement);
        } catch (DifferentUnitTypeException e) {
            return false;
        }
        
        return Double.compare(thisValue, otherValue) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.value, this.unit);
    }

    public double getValue() {
        return this.value;
    }

    public Unit getUnit() {
        return this.unit;
    }

    public Measurement add(Measurement otherMeasurement) {
        double convertedOtherMeasurementValue = this.getUnit().valueOf(otherMeasurement);
        double result = this.value + convertedOtherMeasurementValue;
        return new Measurement(result, this.unit);
    }
}
