package ru.snatkin.task9;

public class Wolf extends Animal implements Barkable, Runable{
    @Override
    public void getName() {
        System.out.println("меня зовут Волк");
    }

    @Override
    public void bark() {
        System.out.println("метод Bark в классе волк");
    }

    @Override
    public void run() {

    }
}
