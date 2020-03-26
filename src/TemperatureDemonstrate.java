import java.util.Scanner;

class Temperature {
    private double fTemp;

    public Temperature() {
        fTemp = 0;
    }

    public Temperature(double fTemp) {
        this.fTemp = fTemp;
    }

    public double getFahrenheit() {
        return fTemp;
    }

    public void setFahrenheit(double fTemp) {
        this.fTemp = fTemp;
    }

    public double getKelvin() {
        return (5.0 / 9.0) * (fTemp - 32) + 273;
    }

    public double getCelsius() {
        return (5.0 / 9.0) * (fTemp - 32);
    }
}

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