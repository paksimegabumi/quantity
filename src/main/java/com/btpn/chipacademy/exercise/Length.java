package com.btpn.chipacademy.exercise;

public class Length {
    private double value;
    private String unit;

    public Length(double value, String unit) {
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
        double convertedValue = this.value / 100;

        return convertedValue == otherLength.value;
    }
}
