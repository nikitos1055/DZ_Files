package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = new Employee("Andiy", 23 , 1200);

    employee.serialize(employee);

    employee.deserialize(employee);


    }
}
