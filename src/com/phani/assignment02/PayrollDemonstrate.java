package com.phani.assignment02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PayrollDemonstrate {

    public static void main(String[] args) {
        String name;
        int id;
        int hoursWorked;
        double payRate;
        double grossPay;

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("\nEnter employee name: ");
        name = input.nextLine();

        System.out.print("\nEnter employee id: ");
        id = input.nextInt();

        System.out.print("\nEnter pay rate: ");
        payRate = input.nextDouble();

        System.out.print("\nEnter number of hours worked: ");
        hoursWorked = input.nextInt();

        Payroll obj = new Payroll(name, id);
        obj.setHours(hoursWorked);
        obj.setRate(payRate);
        grossPay = obj.grossPay();

        System.out.printf("\n%s, employee number %d , made $%s in grosspay.%n", obj.getName(), obj.getIdNumber(), df.format(grossPay));

    }

}