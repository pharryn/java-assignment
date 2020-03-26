package com.phani.assignment01;

public class CarDemonstrate {
    public static void main(String[] args) {
        Car car = new Car(2014, "Hundai");

        System.out.println("Demonstrate of accelerate five times:");
        for (int i = 0; i < 5; i++) {
            car.accelerate();
            System.out.printf("Car %s is running at speed of %s.\n", car.getMake(), car.getSpeed());
        }

        System.out.println("\nDemonstrate of brake five times:");
        for (int i = 0; i < 5; i++) {
            car.Brake();
            System.out.printf("Car %s is running at speed of %s.\n", car.getMake(), car.getSpeed());
        }
    }
}
