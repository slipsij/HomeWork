package ru.snatkin.task9;

public class mainApp {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.getName();
        dog.bark();
        dog.run();

        Wolf wolf = new Wolf();
        wolf.bark();


        Person man = new Person();
        man.run();
        man.swim();
    }
}
