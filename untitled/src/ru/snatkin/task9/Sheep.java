package ru.snatkin.task9;

public class Sheep extends Animal implements Runable{
    @Override
    public void getName() {
        System.out.println("меня зовут Овца");
    }

    @Override
    public void run() {

    }
}
