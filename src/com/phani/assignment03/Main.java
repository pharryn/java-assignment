package com.phani.assignment03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variable to read fahrenheit temperature
        double fahrenheit;
        //create an instance of Scanner class
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Fahrenheit Temperature :");
        //read fahrenehit temperature value from user
        fahrenheit = keyboard.nextDouble();

        //Create an instance of the Temperature class
        Temperature tempConvertor = new Temperature(fahrenheit);

        System.out.printf("%5.2f F= %5.2f deg\n",
                fahrenheit, tempConvertor.getCelsius());
        System.out.printf("%5.2f F= %5.2f K\n",
                fahrenheit, tempConvertor.getKelvin());
    }
}