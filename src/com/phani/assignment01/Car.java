package com.phani.assignment01;

class Car {
    int yearModel;
    String make;
    int speed;

    Car(int yearModel, String make) {
        this.yearModel = yearModel;
        this.make = make;
        this.speed = 0;
    }

    int getYearModel() {
        return yearModel;
    }

    String getMake() {
        return make;
    }

    int getSpeed() {
        return speed;
    }

    void Accelerate() {
        this.speed = this.speed + 5;
    }

    void Brake() {
        this.speed = this.speed - 5;
    }
}