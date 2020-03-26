package com.phani.assignment02;

class Payroll {
    String name; //a String containing the employee's name
    int idNumber; //an integer representing the employee's ID number
    double rate; //a double containing the employee's hourly pay rate
    int hours; //an integer representing the number of hours this employee has worked

    //constructor that takes employee name and id as arguments
    public Payroll(String empName, int ID) {
        name = empName;
        idNumber = ID;
    }

    //Accessors
    //method that returns employee name
    public String getName() {
        return name;
    }

    //Mutators
    //method to assign employee name
    public void setName(String empName) {
        name = empName;
    }

    //method that returns employee id
    public int getidNumber() {
        return idNumber;
    }

    //method that returns rate
    public double getRate() {
        return rate;
    }

    //method to set hourly pay rate
    public void setRate(double r) {
        rate = r;
    }

    //method that returns hours
    public int hours() {
        return hours;
    }

    //method to assign IDNumber
    public void setIdNumber(int id) {
        idNumber = id;
    }

    //method to set number of hours employee has worked
    public void setHours(int h) {
        hours = h;
    }

    //method that returns gross pay
    public double grossPay() {
        return (hours * rate);
    }
}