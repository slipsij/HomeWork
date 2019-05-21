package ru.snatkin.task5;

public class Person {

    private String name;
    private int Age;
    private String Sex;

    public Person(String name, int age, String sex) {
        this.name = name;
        this.Age = age;
        this.Sex = sex;
    }

    Person() {
    }

    public int getAge() {
        return Age;
    }

    public String getSex() {
        return Sex;
    }

    public String getName() {
        return name;
    }
}
