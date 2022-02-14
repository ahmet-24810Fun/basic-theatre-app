package com.company;

public class Main {

    public static void main(String[] args) {
       entrance();
       opportunities op=new opportunities();
       op.add("ahmet");
       op.print();

    }
    public static void entrance() {
        System.out.println("please choose the tickets");
        System.out.println("children 5 dolar");
        System.out.println("adult 15 dolar");
    }
}
