package com.phani.assignment04;

public class EmployeeDemonstrate {
    public static void main(String[] args) {
        Employee e1 = new Employee("Susan Meyer", 47899, "Accouting", "Vice President");
        Employee e2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee e3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

        e1.display();
        e2.display();
        e3.display();
    }
}