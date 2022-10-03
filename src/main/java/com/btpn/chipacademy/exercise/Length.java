package com.btpn.chipacademy.exercise;

import java.util.Objects;

public class Length {
    private final double value;
    private final Unit unit;

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
    
        if(!this.unit.equals(Unit.CENTIMETER)) {
            thisValue *= 100;
        }

        if(!otherLength.unit.equals(Unit.CENTIMETER)) {
            otherValue *= 100;
        }

        return thisValue == otherValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.value, this.unit);
    }
}
