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

    private boolean isSameUnitType(Unit otherUnit){
        return this.unitType.equals(otherUnit.unitType);
    }

    public double toStandardInternationalValue(Measurement measurement) {
        if(!isSameUnitType(measurement.getUnit())){
            throw new DifferentUnitTypeException();
        }
        return measurement.getValue() * this.conversionRateToStandardInternational;
    }

    public double valueOf(Measurement otherMeasurement) {
        double conversionValue = otherMeasurement.getUnit().conversionRateToStandardInternational / this.conversionRateToStandardInternational;
        return otherMeasurement.getValue() * conversionValue;
    }
}
