package com.company;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Employee implements Serializable {

    private String name;

    private int id;

    private transient int salary;

    public Employee(String name, int id, int salary) {
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



    void serialize(Employee employee) throws IOException {
        Scanner sc = new Scanner(System.in);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("text.txt",true));
        if(employee == null){
            System.out.println("Nothing in class");
        }else{
            objectOutputStream.writeObject(employee.toString());
        }
    }

    void deserialize(Object o) throws IOException, ClassNotFoundException {
            File file = new File("text.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            o =  objectInputStream.readObject();
            objectInputStream.close();
    }



    //getters & setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
