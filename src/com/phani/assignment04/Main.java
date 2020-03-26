package com.phani.assignment04;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Susan Meyer", 47899, "Accouting", "Vice President");
        Employee e2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee e3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        System.out.println(String.format("%20s%20s%20s%20s", "Name", "ID Number", "Department", "Position"));
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

    }
}