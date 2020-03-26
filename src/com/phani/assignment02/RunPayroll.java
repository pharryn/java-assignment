package com.phani.assignment02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RunPayroll {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //declare variables to hold employee details
        String name;
        int id;
        int hoursworked;
        double payrate;
        double grossPay;

        //read the employee name
        System.out.print("\nEnter employee name: ");
        name = input.nextLine();

        //read employee id
        System.out.print("\nEnter employee id: ");
        id = input.nextInt();

        //read hourly pay rate
        System.out.print("\nEnter pay rate: ");
        payrate = input.nextDouble();

        //read number of hours worked
        System.out.print("\nEnter number of hours worked: ");
        hoursworked = input.nextInt();

        //create an object to Payroll class by passing employee name and id as arguments
        Payroll obj = new Payroll(name, id);
        //set number of hours worked using setHours method
        obj.setHours(hoursworked);
        //set hourly pay rate using setRate method
        obj.setRate(payrate);

        //get grossPay using grossPay method
        grossPay = obj.grossPay();

        //created object to DecimalFormat to format gross pay to two decimal places
        DecimalFormat df = new DecimalFormat("#.00");

        //display the gross pay on the output screen
        System.out.println("\n" + obj.getName() + ", employee number " + obj.getidNumber() + " , made $" + df.format(grossPay) + " in grosspay.");

    }

}