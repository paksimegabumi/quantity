package com.btpn.chipacademy.exercise;

public enum Unit {
    CENTIMETER(UnitType.LENGTH, 0.01), 
    METER(UnitType.LENGTH, 1), 
    KILOMETER(UnitType.LENGTH, 1000), 
    GRAMS(UnitType.MASS, 1), 
    KILOGRAM(UnitType.MASS, 1000);

    private UnitType unitType;
    private double conversionRateToMeter;
    
    private Unit( UnitType unitType, double conversionRateToMeter) {
        this.unitType = unitType;
        this.conversionRateToMeter = conversionRateToMeter;
    }

    public UnitType getUniType() {
        return this.unitType;
    }

    public double toMeter(double value) {
        return value * this.conversionRateToMeter;
    }
}
