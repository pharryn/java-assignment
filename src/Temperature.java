import java.text.DecimalFormat;
        import java.text.NumberFormat;
        import java.util.Scanner;

class TemperatureModel {
    private double fTemp;

    public TemperatureModel() {
        fTemp = 0;
    }

    public TemperatureModel(double fTemp) {
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

public class Temperature {
    public static void main(String[] args) {
        double fahrenheit;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a Fahrenheit temperature:");
        fahrenheit = keyboard.nextDouble();

        TemperatureModel tempConverter = new TemperatureModel(fahrenheit);
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumIntegerDigits(17);
        nf.setMinimumFractionDigits(15);
        nf.setMinimumFractionDigits(1);

        System.out.printf("The temperature in Fahrenheit is %s\n", nf.format(tempConverter.getFahrenheit()));
        System.out.printf("The temperature in Celsius is %s\n", nf.format(tempConverter.getCelsius()));
        System.out.printf("The temperature in Kelvin is %s\n", nf.format(tempConverter.getKelvin()));
    }
}