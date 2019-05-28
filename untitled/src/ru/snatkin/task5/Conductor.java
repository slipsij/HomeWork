package ru.snatkin.task5;

import java.util.Scanner;

public class Conductor extends Person {

    private boolean Power;

    public boolean isPower() {
        return Power;
    }

    public void setPower(boolean power) {
        Power = power;
    }

    public Conductor(String name, int age, String sex, boolean power) {
        super(name, age, sex);
        Power = power;
    }

    public void poi(Choir choir, String name) {
        System.out.println("Хор поет песню " + name);
    }

    public void hello() {
        System.out.println("Привет! Меня зовут " + super.getName() + ", а это мой хор");
        System.out.println("Мы можем спеть любую песню, которую ты выберешь!");
        System.out.println("Напиши Полюшко-поле, что бы мы спели Полюшко-поле");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sc = input.nextLine();

        if ("poi".equals(sc)){
            System.out.println("Пой");
        } else {
            System.out.println("не пой");
        }
    }
}

//метод спеть песню который принимает на вод название песни (стринг) и будет выдавать на экран мы поем "" песню,
//название будет браться из названия аргументов