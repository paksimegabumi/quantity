package com.btpn.chipacademy.exercise;

public enum Unit {
    CENTIMETER(UnitType.LENGTH, 0.01), 
    METER(UnitType.LENGTH, 1), 
    KILOMETER(UnitType.LENGTH, 1000), 
    GRAMS(UnitType.MASS, 1), 
    KILOGRAM(UnitType.MASS, 1000),
    CELCIUS(UnitType.TEMPERATURE, 0,5),
    FARENHEIT(UnitType.TEMPERATURE,32, 9);

    private UnitType unitType;
    private double conversionRateToStandardInternational;
    private double freezingPoint;
    
    private Unit( UnitType unitType, double conversionRateToStandardInternational) {
        this.unitType = unitType;
        this.conversionRateToStandardInternational = conversionRateToStandardInternational;
    }

    private Unit( UnitType unitType, double freezingPoint, double conversionRateToStandardInternational) {
        this.unitType = unitType;
        this.conversionRateToStandardInternational = conversionRateToStandardInternational;
        this.freezingPoint = freezingPoint;
    }


    private boolean isSameUnitType(Unit otherUnit){
        return this.unitType.equals(otherUnit.unitType);
    }

    public double toStandardInternationalValue(Measurement measurement) {
        if(this.unitType.equals(UnitType.TEMPERATURE)){
            return Unit.CELCIUS.convertTemperatureValueOf(measurement);
        }
        if(this.unitType.equals(UnitType.LENGTH)){
            return Unit.METER.convertValueOf(measurement);
        }
        return Unit.KILOGRAM.convertValueOf(measurement);
    }

    private double convertTemperatureValueOf(Measurement measurement) {
        Unit metric = measurement.getUnit();
        double value = measurement.getValue();

        return (this.conversionRateToStandardInternational / metric.conversionRateToStandardInternational) * (value - metric.freezingPoint) + this.freezingPoint;
    }

    private double convertValueOf(Measurement otherMeasurement) {
        if (!this.isSameUnitType(otherMeasurement.getUnit())) {
            throw new DifferentUnitTypeException();
        }
        double newConversionValue = otherMeasurement.getUnit().conversionRateToStandardInternational / this.conversionRateToStandardInternational;
        return otherMeasurement.getValue() * newConversionValue;
    }
}
