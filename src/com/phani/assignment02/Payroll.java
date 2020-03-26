package com.phani.assignment02;

class Payroll {
    private String name;
    private int idNumber;
    private double rate;
    private int hours;

    public Payroll(String employeeName, int id) {
        name = employeeName;
        idNumber = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String empName) {
        name = empName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int id) {
        idNumber = id;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double r) {
        rate = r;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int h) {
        hours = h;
    }

    public double grossPay() {
        return (hours * rate);
    }
}