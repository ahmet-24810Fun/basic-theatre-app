package com.company;

import java.util.ArrayList;

public class opportunities {
    private int salary;
    private String name;
    private ArrayList arrayList=new ArrayList();

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void add(String name){
        arrayList.add(name);
    }
    public void print() {
        System.out.println("name is " +name+" budget " +salary);
    }
}
