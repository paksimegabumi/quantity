package com.btpn.chipacademy.exercise;

import java.util.Objects;

public class Measurement {
    private final double value;
    private final Unit unit;
    private static final int CONVERSION_RATE_METER_TO_CENTIMETER = 100;
    private static final int CONVERSION_RATE_KILOMETER_TO_CENTIMETER = 100_000;
    private static final int CONVERSION_RATE_KILOGRAM_TO_GRAM = 1000;

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

        Measurement otherLength = (Measurement) object;
        double thisValue = this.value;
        double otherValue = otherLength.value;
    
        if(this.unit.equals(Unit.METER)) {
            thisValue *= Measurement.CONVERSION_RATE_METER_TO_CENTIMETER;
        }

        if(this.unit.equals(Unit.KILOMETER)) {
            thisValue *= Measurement.CONVERSION_RATE_KILOMETER_TO_CENTIMETER;
        }

        if(this.unit.equals(Unit.KILOGRAM)) {
            thisValue *= Measurement.CONVERSION_RATE_KILOGRAM_TO_GRAM;
        }

        if(otherLength.unit.equals(Unit.METER)) {
            otherValue *= Measurement.CONVERSION_RATE_METER_TO_CENTIMETER;
        }

        if(otherLength.unit.equals(Unit.KILOMETER)) {
            otherValue *= Measurement.CONVERSION_RATE_KILOMETER_TO_CENTIMETER;
        }

        if(otherLength.unit.equals(Unit.KILOGRAM)) {
            otherValue *= Measurement.CONVERSION_RATE_KILOGRAM_TO_GRAM;
        }
        
        return Double.compare(thisValue, otherValue) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.value, this.unit);
    }
}
