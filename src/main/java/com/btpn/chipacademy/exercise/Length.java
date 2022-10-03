package com.btpn.chipacademy.exercise;

import java.util.Objects;

public class Length {
    private final double value;
    private final Unit unit;
    private static final int CONVERSION_RATE_METER_TO_CENTIMETER = 100;
    private static final int CONVERSION_RATE_KILOMETER_TO_CENTIMETER = 100_000;

    public Length(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object object) {
        if(object == this) {
            return true;
        }

        if(!(object instanceof Length)) {
            return false;
        }

        Length otherLength = (Length) object;
        double thisValue = this.value;
        double otherValue = otherLength.value;
    
        if(this.unit.equals(Unit.METER)) {
            thisValue *= Length.CONVERSION_RATE_METER_TO_CENTIMETER;
        }

        if(this.unit.equals(Unit.KILOMETER)) {
            thisValue *= Length.CONVERSION_RATE_KILOMETER_TO_CENTIMETER;
        }

        if(otherLength.unit.equals(Unit.METER)) {
            otherValue *= Length.CONVERSION_RATE_METER_TO_CENTIMETER;
        }

        if(otherLength.unit.equals(Unit.KILOMETER)) {
            otherValue *= Length.CONVERSION_RATE_KILOMETER_TO_CENTIMETER;
        }
        
        return thisValue == otherValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.value, this.unit);
    }
}
