package ru.snatkin.task9;

public class Person extends Man {
    @Override
    public void run() {
        System.out.println("Бегу из абстрактного класса Man");
    }

    @Override
    public void swim() {
        System.out.println("Плыву из абстрактного класса Man");
    }
}
