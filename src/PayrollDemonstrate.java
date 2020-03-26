import java.text.DecimalFormat;
import java.util.Scanner;

class Payroll {
    private String name;
    private int idNumber;
    private double rate;
    private int hours;

    public Payroll(String employeeName, int id) {
        name = employeeName;
        idNumber = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String empName) {
        name = empName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int id) {
        idNumber = id;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double r) {
        rate = r;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int h) {
        hours = h;
    }

    public double grossPay() {
        return (hours * rate);
    }
}

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