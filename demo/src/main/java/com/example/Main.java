package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        System.out.println("Hello Артём");
        
        System.out.println("Задание 2");
        Tester person = new Tester("Артём","Куриленко");
        person.introduce("я не навижу ", "свой проект");
        person.work();
        Tester.printTesterDetails(person);
    }
}