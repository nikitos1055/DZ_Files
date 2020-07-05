package com.company;

import java.io.*;
import java.util.*;


public class Employee implements Serializable {

    private String name;

    private Integer id;

    private transient Integer salary;

    File file = new File("text.txt");

    public Employee(String name, Integer id, Integer salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}'+"\n";
    }

    void serialize(List<Employee> arrayList) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        for(Employee employee : arrayList) {
            objectOutputStream.writeObject(employee);
        }
            objectOutputStream.close();
    }

     void deserialize(List<Employee> arrayList) throws IOException, ClassNotFoundException {
         ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
         for(Employee employee : arrayList) {
             Employee employee1 = (Employee) objectInputStream.readObject();
             System.out.print(employee1);
         }
         objectInputStream.close();
     }
}



