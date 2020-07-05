package com.company;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Employee> employee = new ArrayList<>();
        employee.add(new Employee("Nikita" , 23213 , 2000));
        employee.add(new Employee("Andriy" , 12342 , 1378));
        employee.add(new Employee("Valyl" , 45634 , 1212));
        employee.add(new Employee("Myroslav" , 12452 , 1243));
        employee.add(new Employee("Petro" , 68746 , 1542));

        employee.get(0).serialize(employee);


        System.out.println("\nDeserialize successful done.");
        employee.get(0).deserialize(employee);



    }
}
