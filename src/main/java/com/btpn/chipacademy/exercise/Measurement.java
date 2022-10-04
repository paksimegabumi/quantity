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

        Measurement otherLength = (Measurement) object;
        double thisValue = this.unit.toMeter(this.value);
        double otherValue = otherLength.unit.toMeter(otherLength.value);
        
        return Double.compare(thisValue, otherValue) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.value, this.unit);
    }
}
