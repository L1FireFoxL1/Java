package com.example;

public class Tester {
    private String name;
    private String secondName;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String secondName) {
        this(name, secondName, 0, "B1", 500.0);
    }

    public Tester(String name, String secondName, int experienceInYears) {
        this(name, secondName, experienceInYears, "B2", 1000.0);
    }

    public Tester(String name, String secondName, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.secondName = secondName;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public void introduce() {
        System.out.println("Привет! Меня зовут " + name + " " + secondName + ".");
    }

    public void introduce(String txt) {
        System.out.println(txt + ", меня зовут " + name + " " + secondName + ".");
    }

    public void introduce(String text1 , String txt) {
        System.out.println(text1 + txt + ", меня зовут " + name + " " + secondName + ".");
    }

    public void work() {
        System.out.println("Я не работаю.");
    }

    public static void printTesterDetails(Tester tester) {
        System.out.println("Имя: " + tester.name);
        System.out.println("Фамилия: " + tester.secondName);
        System.out.println("Опыт работы (лет): " + tester.experienceInYears);
        System.out.println("Уровень английского: " + tester.englishLevel);
    }
}