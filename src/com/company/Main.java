package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Nikita" , 23213 , 2000);
        employee[1] = new Employee("Andriy" , 12342 , 1378);
        employee[2] = new Employee("Valyl" , 45634 , 1212);
        employee[3] = new Employee("Myroslav" , 12452 , 1243);
        employee[4] = new Employee("Petro" , 68746 , 1542);

        System.out.println("\nSerialize successful done.");

        for(Employee employees : employee) {
            employees.serialize(employees);
        }

        System.out.println("\nDeserialize successful done.");

        for(Employee employees : employee) {
            employees.deserialize(employee);
        }

    }
}
