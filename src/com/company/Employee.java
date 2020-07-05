package com.company;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Employee implements Serializable {

    private String name;

    private Integer id;

    private transient Integer salary;

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



    void serialize(Object o) throws IOException {
        Scanner sc = new Scanner(System.in);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("text.txt",true));
        if(o == null){
            System.out.println("Nothing in class");
        }else{
            objectOutputStream.writeObject(o.toString());
            System.out.print(o.toString());
        }
    }

     void deserialize(Employee[] employees) throws IOException, ClassNotFoundException {
            File file = new File("text.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));

                employees = (Employee[]) objectInputStream.readObject();
                System.out.print(employees);
            
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
