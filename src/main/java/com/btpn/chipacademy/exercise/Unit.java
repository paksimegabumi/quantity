package com.btpn.chipacademy.exercise;

public enum Unit {
    CENTIMETER(UnitType.LENGTH, 0, 100), 
    METER(UnitType.LENGTH, 0, 1), 
    KILOMETER(UnitType.LENGTH, 0, 0.001), 
    GRAMS(UnitType.MASS, 0, 1000), 
    KILOGRAM(UnitType.MASS, 0, 1),
    CELSIUS(UnitType.TEMPERATURE, 0,5),
    FAHRENHEIT(UnitType.TEMPERATURE,32, 9),
    KELVIN(UnitType.TEMPERATURE,273.15, 5);
    
    private UnitType unitType;
    private double conversionRateToStandardInternational;
    private double coefficient;

    private Unit( UnitType unitType, double coefficient, double conversionRateToStandardInternational) {
        this.unitType = unitType;
        this.conversionRateToStandardInternational = conversionRateToStandardInternational;
        this.coefficient = coefficient;
    }

    private boolean isSameUnitType(Unit otherUnit){
        return this.unitType.equals(otherUnit.unitType);
    }

    public double toStandardInternationalValue(Measurement measurement) {
        return this.unitType.getInternationalStandardUnit().convertValueOf(measurement);
    }

    private double convertValueOf(Measurement measurement) {
        if (!this.isSameUnitType(measurement.getUnit())) {
            throw new DifferentUnitTypeException();
        }
        double newConversionValue = this.conversionRateToStandardInternational / measurement.getUnit().conversionRateToStandardInternational;
        return (measurement.getValue() - measurement.getUnit().coefficient) * newConversionValue + this.coefficient;
    }
}
