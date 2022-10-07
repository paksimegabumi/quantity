package com.btpn.chipacademy.exercise;

public enum UnitType {
    MASS {
        @Override
        Unit getInternationalStandardUnit() {
            return Unit.KILOGRAM;
        }
    },
    LENGTH {
        @Override
        Unit getInternationalStandardUnit() {
            return Unit.METER;
        }
    },
    TEMPERATURE {
    @Override
        Unit getInternationalStandardUnit() {
            return Unit.CELSIUS;
        }
    };

    abstract Unit getInternationalStandardUnit();
}
