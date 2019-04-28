package ru.snatkin.task7;

import java.util.Scanner;

public class Calculator {

    Scanner sc = new Scanner(System.in);{
        System.out.println("Я калькулятор я считаю!");
        System.out.println("Введите первое число");
        double a = sc.nextInt();
        System.out.println("Введите второе число");
        double b = sc.nextInt();
        System.out.println("Введите оперант");
        double с = sc.nextInt();
    }


    public static double division(double a, double b) {
        return (double) a / b; }

        public static double umnozh(double a, double b) {
            return (double) a * b;}

            public static double slozh(double a, double b) {
                return (double) a + b;}
}


