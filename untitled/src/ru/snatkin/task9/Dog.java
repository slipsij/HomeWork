package ru.snatkin.task9;

public class Dog extends Animal implements Barkable, Runable {

    public Dog() {
    }
    @Override
    public void getName() {
        System.out.println("меня зовут Собака");
    }

    @Override
    public void bark() {
        System.out.println("метод Bark в классе сабака");
    }

    @Override
    public void run() {

    }
}
