import java.text.DecimalFormat;
import java.util.Scanner;

class PayrollModel {
    private String name;
    private int idNumber;
    private double rate;
    private int hours;

    public PayrollModel(String employeeName, int id) {
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

public class Payroll {

    public static void main(String[] args) {
        String name;
        int id;
        int hoursWorked;
        double payRate;
        double grossPay;

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Enter employee's name:");
        name = input.nextLine();

        System.out.print("Enter employee's ID number:");
        id = input.nextInt();

        System.out.print("Enter hourly rate:");
        payRate = input.nextDouble();

        System.out.print("Enter number of hours worked:");
        hoursWorked = input.nextInt();

        PayrollModel obj = new PayrollModel(name, id);
        obj.setHours(hoursWorked);
        obj.setRate(payRate);
        grossPay = obj.grossPay();

        System.out.printf("%s, employee number %d, made $%01.2f in gross pay.", obj.getName(), obj.getIdNumber(), grossPay);
    }

}