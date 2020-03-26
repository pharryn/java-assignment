package com.phani.assignment03;

import java.util.Scanner;

public class TemperatureDemonstrate {
    public static void main(String[] args) {
        double fahrenheit;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter Fahrenheit Temperature: ");
        fahrenheit = keyboard.nextDouble();

        Temperature tempConverter = new Temperature(fahrenheit);

        System.out.printf("The temperature in Fahrenheit is %5.2f\n", tempConverter.getFahrenheit());
        System.out.printf("The temperature in Celsius is %5.2f\n", tempConverter.getCelsius());
        System.out.printf("The temperature in Kelvin is %5.2f\n", tempConverter.getKelvin());
    }
}