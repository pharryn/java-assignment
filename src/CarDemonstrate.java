
/* Car.java */

class Car {
    private int yearModel;
    private String make;
    private int speed;

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

    void accelerate() {
        this.speed += 5;
    }

    void Brake() {
        this.speed -= 5;
    }
}

/* CarDemonstrate.java */
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
