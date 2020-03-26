package com.phani.assignment01;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(2014, "Hundai");
        for (int i = 0; i < 5; i++) {
            car.Accelerate();
            System.out.println(car.getSpeed());
        }

        for (int i = 0; i < 5; i++) {
            car.Brake();
            System.out.println(car.getSpeed());
        }
    }
}
