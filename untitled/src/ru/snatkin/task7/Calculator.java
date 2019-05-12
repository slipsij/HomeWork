package ru.snatkin.task7;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Я калькулятор, я считаю!");
        System.out.println("Для начала выбрите какое действие вы хотите произвести с числами");
        System.out.println("1 - сложение; 2 - вычитание; 3 - умножение; 4 - деление; 5 - процент от числа.");

        int decision = sc.nextInt();
        if (decision > 0 && decision < 5) {
            System.out.println("Введите первое число");
        } else {
            System.out.println("Вы ввели некорректное число");
        }
        double a = sc.nextDouble();
        System.out.println("Введите второе число");
        double b = sc.nextDouble();
    }
//почему не запускается второй метод? как его запустить?
        public static void calc ( int decision, double a, double b) {
            double r;
            switch (decision) {
                case 1:
                    r = a + b;
                    System.out.println("Результат " + r);
                    break;

                case 2:
                    r = a - b;
                    System.out.println("Результат " + r);
                    break;
                case 3:
                    r = a * b;
                    System.out.println("Результат " + r);
                    break;

                case 4:
                    r = a / b;
                    System.out.println("Результат " + r);
                    break;

                case 5:
                    r = (a * 100) / b;
                    if (b <= 0) {
                        System.out.println("На ноль делить нельзя");
                    } else {
                        System.out.println("Результат " + r);
                    }
                    break;
            }
        }
    }


