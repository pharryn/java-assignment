package com.phani.assignment03;

public class Temperature {
    private double fTemp;

    public Temperature() {
        fTemp = 0;
    }

    public Temperature(double fTemp) {
        this.fTemp = fTemp;
    }

    public double getFahrenheit() {
        return fTemp;
    }

    public void setFahrenheit(double fTemp) {
        this.fTemp = fTemp;
    }

    public double getKelvin() {
        return (5.0 / 9.0) * (fTemp - 32) + 273;
    }

    public double getCelsius() {
        return (5.0 / 9.0) * (fTemp - 32);
    }
}