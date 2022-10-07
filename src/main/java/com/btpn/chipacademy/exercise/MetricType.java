package com.btpn.chipacademy.exercise;

public enum MetricType {
    MASS {
        @Override
        Metric getInternationalStandardUnit() {
            return Metric.KILOGRAM;
        }
    },
    LENGTH {
        @Override
        Metric getInternationalStandardUnit() {
            return Metric.METER;
        }
    },
    TEMPERATURE {
    @Override
        Metric getInternationalStandardUnit() {
            return Metric.CELSIUS;
        }
    };

    abstract Metric getInternationalStandardUnit();
}
