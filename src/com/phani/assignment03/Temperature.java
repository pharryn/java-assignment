package com.phani.assignment03;

public class Temperature {
    //variable to store celsius
    private double ftemp;

    //default constructor
    public Temperature() {
        ftemp = 0;
    }

    /*Constructor that takes ftemp as input
    arguments and set ftemp to this class
    instance variable*/
    public Temperature(double ftemp) {
        this.ftemp = ftemp;
    }

    /*Method that returns the ftemp value*/
    public double getFahrenheit() {
        return ftemp;
    }

    /*Method that sets the ftemp value*/
    public void setFahrenheit(double ftemp) {
        this.ftemp = ftemp;
    }

    /*
     * The method getKelvin that calculates the kelvin
     * temperature of the ftemp and return the value
     */
    public double getKelvin() {
        return (5.0 / 9.0) * (ftemp - 32) + 273;
    }

    /*
     * The method getCelsius that calculates the celsius
     * temperature of the ftemp and return the value
     */
    public double getCelsius() {
        return (5.0 / 9.0) * (ftemp - 32);
    }
}