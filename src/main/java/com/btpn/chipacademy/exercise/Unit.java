package com.btpn.chipacademy.exercise;

public enum Unit {
    CENTIMETER(UnitType.LENGTH, 0.01), 
    METER(UnitType.LENGTH, 1), 
    KILOMETER(UnitType.LENGTH, 1000), 
    GRAMS(UnitType.MASS, 1), 
    KILOGRAM(UnitType.MASS, 1000);

    private UnitType unitType;
    private double conversionRateToStandardInternational;
    
    private Unit( UnitType unitType, double conversionRateToStandardInternational) {
        this.unitType = unitType;
        this.conversionRateToStandardInternational = conversionRateToStandardInternational;
    }

    public double toStandardInternationalValue(Measurement measurement) {
        return measurement.getValue() * this.conversionRateToStandardInternational;
    }

    public boolean isSameUnitType(Unit otherUnit){
        return this.unitType.equals(otherUnit.unitType);
    }
}
